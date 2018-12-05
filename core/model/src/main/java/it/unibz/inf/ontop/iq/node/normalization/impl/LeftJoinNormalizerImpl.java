package it.unibz.inf.ontop.iq.node.normalization.impl;

import com.google.common.collect.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import it.unibz.inf.ontop.exception.MinorOntopInternalBugException;
import it.unibz.inf.ontop.injection.IntermediateQueryFactory;
import it.unibz.inf.ontop.iq.IQProperties;
import it.unibz.inf.ontop.iq.IQTree;
import it.unibz.inf.ontop.iq.NaryIQTree;
import it.unibz.inf.ontop.iq.UnaryIQTree;
import it.unibz.inf.ontop.iq.node.*;
import it.unibz.inf.ontop.iq.node.impl.UnsatisfiableConditionException;
import it.unibz.inf.ontop.iq.node.normalization.ConditionSimplifier;
import it.unibz.inf.ontop.iq.node.normalization.LeftJoinNormalizer;
import it.unibz.inf.ontop.model.term.*;
import it.unibz.inf.ontop.substitution.ImmutableSubstitution;
import it.unibz.inf.ontop.substitution.SubstitutionFactory;
import it.unibz.inf.ontop.utils.ImmutableCollectors;
import it.unibz.inf.ontop.utils.VariableGenerator;

import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static it.unibz.inf.ontop.model.term.functionsymbol.BooleanExpressionOperation.EQ;
import static it.unibz.inf.ontop.model.term.functionsymbol.BooleanExpressionOperation.IS_NOT_NULL;
import static it.unibz.inf.ontop.model.term.functionsymbol.ExpressionOperation.*;

@Singleton
public class LeftJoinNormalizerImpl implements LeftJoinNormalizer {

    private static final int MAX_ITERATIONS = 10000;
    private final SubstitutionFactory substitutionFactory;
    private final TermFactory termFactory;
    private final IntermediateQueryFactory iqFactory;
    private final ConditionSimplifier conditionSimplifier;
    private final JoinLikeChildBindingLifter bindingLifter;

    @Inject
    private LeftJoinNormalizerImpl(SubstitutionFactory substitutionFactory, TermFactory termFactory,
                                   IntermediateQueryFactory iqFactory, ConditionSimplifier conditionSimplifier,
                                   JoinLikeChildBindingLifter bindingLifter) {
        this.substitutionFactory = substitutionFactory;
        this.termFactory = termFactory;
        this.iqFactory = iqFactory;
        this.conditionSimplifier = conditionSimplifier;
        this.bindingLifter = bindingLifter;
    }


    @Override
    public IQTree normalizeForOptimization(LeftJoinNode ljNode, IQTree initialLeftChild, IQTree initialRightChild,
                                           VariableGenerator variableGenerator,
                                           IQProperties currentIQProperties) {

        ImmutableSet<Variable> projectedVariables = Stream.of(initialLeftChild, initialRightChild)
                .flatMap(c -> c.getVariables().stream())
                .collect(ImmutableCollectors.toSet());

        // Non-final
        LJNormalizationState state = new LJNormalizationState(projectedVariables, initialLeftChild, initialRightChild,
                ljNode.getOptionalFilterCondition(), variableGenerator);

        // The left child cannot be made empty because of the LJ. Therefore this step is enough to detect emptiness.
        state = state.liftLeftChild();
        if (state.isEmpty())
            return state.createNormalizedTree(currentIQProperties);

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            LJNormalizationState newState = state
                    .optimizeLeftJoinCondition()
                    .liftRightChild()
                    // A DISTINCT on the left might have been waiting because of a not-yet distinct right child
                    .liftLeftChild();

            if (state.equals(newState))
                return state.createNormalizedTree(currentIQProperties);

            state = newState;
        }
        throw new MinorOntopInternalBugException("LJ.normalizeForOptimization() did not converge after " + MAX_ITERATIONS);
    }


    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    private class LJNormalizationState {

        private final IQTree leftChild;
        private final IQTree rightChild;
        private final VariableGenerator variableGenerator;
        private final Optional<ImmutableExpression> ljCondition;
        // Parent first
        private final ImmutableList<UnaryOperatorNode> ancestors;
        private final ImmutableSet<Variable> projectedVariables;

        private LJNormalizationState(ImmutableSet<Variable> projectedVariables, IQTree leftChild, IQTree rightChild,
                                     Optional<ImmutableExpression> ljCondition,
                                     ImmutableList<UnaryOperatorNode> ancestors,
                                     VariableGenerator variableGenerator) {
            this.projectedVariables = projectedVariables;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.ljCondition = ljCondition;
            this.ancestors = ancestors;
            this.variableGenerator = variableGenerator;
        }

        protected LJNormalizationState(ImmutableSet<Variable> projectedVariables, IQTree initialLeftChild,
                                    IQTree initialRightChild, Optional<ImmutableExpression> ljCondition,
                                    VariableGenerator variableGenerator) {
            this(projectedVariables, initialLeftChild, initialRightChild, ljCondition,
                    ImmutableList.of(), variableGenerator);
        }

        private LJNormalizationState updateConditionAndRightChild(Optional<ImmutableExpression> newLJCondition,
                                                                  IQTree newRightChild) {
            if (ljCondition.equals(newLJCondition) && rightChild.equals(newRightChild))
                return this;

            return new LJNormalizationState(projectedVariables, leftChild, newRightChild, newLJCondition,
                    ancestors, variableGenerator);
        }

        private LJNormalizationState updateParentConditionRightChild(
                UnaryOperatorNode newParent, Optional<ImmutableExpression> newLJCondition, IQTree newRightChild) {
            return updateParentConditionChildren(newParent, newLJCondition, leftChild, newRightChild);
        }

        private LJNormalizationState updateParentConditionChildren(UnaryOperatorNode newParent,
                                                                   Optional<ImmutableExpression> newLJCondition,
                                                                   IQTree newLeftChild, IQTree newRightChild) {
            ImmutableList<UnaryOperatorNode> newAncestors = ImmutableList.<UnaryOperatorNode>builder()
                    .add(newParent)
                    .addAll(ancestors)
                    .build();

            return new LJNormalizationState(projectedVariables, newLeftChild, newRightChild, newLJCondition,
                    newAncestors, variableGenerator);
        }

        private LJNormalizationState updateLeftChild(IQTree newLeftChild) {
            if (newLeftChild.equals(leftChild))
                return this;
            return new LJNormalizationState(projectedVariables, newLeftChild, rightChild, ljCondition,
                    ancestors, variableGenerator);
        }

        public LJNormalizationState liftLeftChild() {
            IQTree liftedLeftChild = leftChild.normalizeForOptimization(variableGenerator);
            QueryNode leftRootNode = liftedLeftChild.getRootNode();

            if (leftRootNode instanceof ConstructionNode)
                return liftLeftConstruction((UnaryIQTree) liftedLeftChild);
            else if (leftRootNode instanceof DistinctNode)
                return liftLeftDistinct((UnaryIQTree) liftedLeftChild);
            else if (leftRootNode instanceof FilterNode)
                return liftLeftFilterNode((UnaryIQTree) liftedLeftChild);
            else if (leftRootNode instanceof CommutativeJoinNode)
                return liftLeftCommutativeJoin(liftedLeftChild);
            else if (liftedLeftChild.isDeclaredAsEmpty())
                // Stops the liftLeftChild() recursion
                return new LJNormalizationState(projectedVariables, liftedLeftChild,
                        iqFactory.createEmptyNode(rightChild.getVariables()), Optional.empty(),
                        ancestors, variableGenerator);
            else
                // Stops the liftLeftChild() recursion
                return updateLeftChild(liftedLeftChild);
        }

        private LJNormalizationState liftLeftConstruction(UnaryIQTree liftedLeftChild) {
            ConstructionNode leftConstructionNode = (ConstructionNode) liftedLeftChild.getRootNode();
            IQTree leftGrandChild = liftedLeftChild.getChild();

            try {
                return bindingLifter.liftRegularChildBinding(leftConstructionNode, 0, leftGrandChild,
                        ImmutableList.of(liftedLeftChild,rightChild),
                        leftGrandChild.getVariables(), ljCondition, variableGenerator, this::applyLeftChildBindingLift)
                        // Recursive (for optimization purposes)
                        .liftLeftChild();
            }
            /*
             * Replaces the LJ by the left child
             */
            catch (UnsatisfiableConditionException e) {
                EmptyNode newRightChild = iqFactory.createEmptyNode(rightChild.getVariables());

                ConstructionNode newParentConstructionNode = iqFactory.createConstructionNode(
                        Sets.union(leftConstructionNode.getVariables(), newRightChild.getVariables()).immutableCopy(),
                        leftConstructionNode.getSubstitution());

                // Stops the liftLeftChild() recursion
                return updateParentConditionChildren(newParentConstructionNode, Optional.empty(), leftGrandChild, newRightChild);
            }
        }

        private LJNormalizationState liftLeftDistinct(UnaryIQTree liftedLeftChild) {
            DistinctNode distinctNode = (DistinctNode) liftedLeftChild.getRootNode();
            if (rightChild.isDistinct()) {
                IQTree newRightChild = rightChild.removeDistincts();
                IQTree newLeftChild = liftedLeftChild.getChild();
                return updateParentConditionChildren(distinctNode, ljCondition, newLeftChild, newRightChild)
                        // Recursive (for optimization purposes)
                        .liftLeftChild();
            }
            else
                // Stops the liftLeftChild() recursion
                return updateLeftChild(liftedLeftChild);
        }

        private LJNormalizationState liftRightDistinct(UnaryIQTree liftedRightChild) {
            DistinctNode distinctNode = (DistinctNode) liftedRightChild.getRootNode();
            if (leftChild.isDistinct()) {
                IQTree newLeftChild = leftChild.removeDistincts();
                IQTree newRightChild = liftedRightChild.getChild();
                return updateParentConditionChildren(distinctNode, ljCondition, newLeftChild, newRightChild);
            }
            else
                return updateConditionAndRightChild(ljCondition, liftedRightChild);
        }

        private LJNormalizationState liftLeftFilterNode(UnaryIQTree liftedLeftChild) {
            FilterNode filterNode = (FilterNode) liftedLeftChild.getRootNode();
            return updateParentConditionChildren(filterNode, ljCondition, liftedLeftChild.getChild(), rightChild);
        }

        private LJNormalizationState liftLeftCommutativeJoin(IQTree liftedLeftChild) {
            CommutativeJoinNode joinNode = (CommutativeJoinNode) liftedLeftChild.getRootNode();

            Optional<ImmutableExpression> filterCondition = joinNode.getOptionalFilterCondition();
            if (filterCondition.isPresent()) {

                FilterNode newParent = iqFactory.createFilterNode(filterCondition.get());

                NaryIQTree newLeftChild = iqFactory.createNaryIQTree(
                        joinNode.changeOptionalFilterCondition(Optional.empty()),
                        liftedLeftChild.getChildren());

                return updateParentConditionChildren(newParent, ljCondition, newLeftChild, rightChild);
            }
            else
                return updateLeftChild(liftedLeftChild);
        }


        private LJNormalizationState liftRightFilter(UnaryIQTree liftedRightChild) {
            FilterNode filterNode = (FilterNode) liftedRightChild.getRootNode();

            ImmutableExpression newLJCondition = ljCondition
                    .map(c -> termFactory.getConjunction(Stream.of(c, filterNode.getFilterCondition())).get())
                    .orElseGet(filterNode::getFilterCondition);

            return updateConditionAndRightChild(Optional.of(newLJCondition), liftedRightChild.getChild());
        }

        private LJNormalizationState liftRightCommutativeJoin(IQTree liftedRightChild) {
            CommutativeJoinNode joinNode = (CommutativeJoinNode) liftedRightChild.getRootNode();

            Optional<ImmutableExpression> filterCondition = joinNode.getOptionalFilterCondition();
            if (filterCondition.isPresent()) {
                ImmutableExpression condition = filterCondition.get();
                ImmutableExpression newLJCondition = ljCondition
                        .map(c -> termFactory.getConjunction(Stream.concat(
                                c.flattenAND().stream(),
                                condition.flattenAND().stream())).get())
                        .orElse(condition);

                NaryIQTree newRightChild = iqFactory.createNaryIQTree(
                        joinNode.changeOptionalFilterCondition(Optional.empty()),
                        liftedRightChild.getChildren());

                return updateConditionAndRightChild(Optional.of(newLJCondition), newRightChild);
            }
            else
                return updateConditionAndRightChild(ljCondition, liftedRightChild);
        }

        private LJNormalizationState applyLeftChildBindingLift(
                ImmutableList<IQTree> children, IQTree leftGrandChild, int leftChildPosition,
                Optional<ImmutableExpression> ljCondition, ImmutableSubstitution<ImmutableTerm> naiveAscendingSubstitution,
                ImmutableSubstitution<? extends VariableOrGroundTerm> descendingSubstitution) {

            if (children.size() != 2)
                throw new MinorOntopInternalBugException("Two children were expected, not " + children);

            IQTree initialRightChild = children.get(1);

            ImmutableSet<Variable> leftVariables = Sets.union(
                    children.get(0).getVariables(),
                    leftGrandChild.getVariables()).immutableCopy();

            IQTree rightSubTree = initialRightChild.applyDescendingSubstitution(descendingSubstitution, ljCondition);

            // Creates a right provenance if needed for lifting the substitution
            Optional<RightProvenance> rightProvenance = createProvenanceElements(rightSubTree,
                    naiveAscendingSubstitution, leftVariables, variableGenerator);

            ImmutableSubstitution<ImmutableTerm> ascendingSubstitution = rightProvenance
                    .map(p -> makeRightSpecificDefsProvenanceDependent(naiveAscendingSubstitution, p.variable, leftVariables))
                    .orElse(naiveAscendingSubstitution);

            IQTree newRightChild = rightProvenance
                    .flatMap(p -> p.constructionNode)
                    .map(n -> (IQTree) iqFactory.createUnaryIQTree(n, rightSubTree))
                    .orElse(rightSubTree);

            ImmutableSet<Variable> parentVariables = children.stream()
                    .flatMap(c -> c.getVariables().stream())
                    .collect(ImmutableCollectors.toSet());

            ConstructionNode parentConstructionNode = iqFactory.createConstructionNode(parentVariables, ascendingSubstitution);

            return updateParentConditionChildren(parentConstructionNode, ljCondition, leftGrandChild, newRightChild);
        }

        private ImmutableSubstitution<ImmutableTerm> makeRightSpecificDefsProvenanceDependent(
                ImmutableSubstitution<ImmutableTerm> ascendingSubstitution, Variable provenanceVariable,
                ImmutableSet<Variable> leftVariables) {
            return substitutionFactory.getSubstitution(
                    ascendingSubstitution.getImmutableMap().entrySet().stream()
                        .collect(ImmutableCollectors.toMap(
                                Map.Entry::getKey,
                                e -> (leftVariables.contains(e.getKey()) || isNullWhenRightIsRejected(e.getValue(), leftVariables))
                                        ? e.getValue()
                                        : transformRightSubstitutionValue(e.getValue(), leftVariables, provenanceVariable)
                        )));
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof LJNormalizationState))
                return false;

            LJNormalizationState other = (LJNormalizationState) o;
            return leftChild.isEquivalentTo(other.leftChild)
                    && rightChild.isEquivalentTo(other.rightChild)
                    && ljCondition.equals(other.ljCondition)
                    && ancestors.size() == other.ancestors.size()
                    && IntStream.range(0, ancestors.size())
                        .allMatch(i -> ancestors.get(i).isEquivalentTo(other.ancestors.get(i)));
        }

        private LJNormalizationState optimizeLeftJoinCondition() {
            if (!ljCondition.isPresent())
                return this;

            ImmutableSet<Variable> leftVariables = leftChild.getVariables();

            try {
                ConditionSimplifier.ExpressionAndSubstitution simplificationResults = conditionSimplifier.simplifyCondition(ljCondition, leftVariables);

                ImmutableSubstitution<NonFunctionalTerm> downSubstitution = selectDownSubstitution(
                        simplificationResults.getSubstitution(), rightChild.getVariables());

                if (downSubstitution.isEmpty())
                    return updateConditionAndRightChild(simplificationResults.getOptionalExpression(), rightChild);

                IQTree updatedRightChild = rightChild.applyDescendingSubstitution(downSubstitution,
                        simplificationResults.getOptionalExpression());

                Optional<RightProvenance> rightProvenance = createProvenanceElements(updatedRightChild, downSubstitution,
                        leftVariables, variableGenerator);

                IQTree newRightChild = rightProvenance
                        .flatMap(p -> p.constructionNode)
                        .map(n -> (IQTree) iqFactory.createUnaryIQTree(n, updatedRightChild))
                        .orElse(updatedRightChild);

                ImmutableSubstitution<ImmutableTerm> newAscendingSubstitution = computeLiftableSubstitution(
                        downSubstitution, rightProvenance.map(p -> p.variable), leftVariables);

                ConstructionNode newParentConstructionNode = iqFactory.createConstructionNode(
                        Sets.union(leftChild.getVariables(), rightChild.getVariables()).immutableCopy(),
                        newAscendingSubstitution);

                return updateParentConditionChildren(newParentConstructionNode,
                        simplificationResults.getOptionalExpression(),  leftChild, newRightChild);

            } catch (UnsatisfiableConditionException e) {
                return updateConditionAndRightChild(Optional.empty(), iqFactory.createEmptyNode(rightChild.getVariables()));
            }
        }

        /**
         * TODO: refactor
         */
        private LJNormalizationState liftRightChild() {

            IQTree liftedRightChild = rightChild.normalizeForOptimization(variableGenerator);
            QueryNode rightRootNode = liftedRightChild.getRootNode();

            if (rightRootNode instanceof ConstructionNode) {
                ConstructionNode rightConstructionNode = (ConstructionNode) liftedRightChild.getRootNode();
                IQTree rightGrandChild = ((UnaryIQTree) liftedRightChild).getChild();

                ImmutableSubstitution<ImmutableTerm> rightSubstitution = rightConstructionNode.getSubstitution();
                return liftRightConstruction(rightGrandChild, rightSubstitution, variableGenerator);
            }
            else if (rightRootNode instanceof DistinctNode) {
                return liftRightDistinct((UnaryIQTree) liftedRightChild);
            }
            else if (rightRootNode instanceof FilterNode) {
                return liftRightFilter((UnaryIQTree)liftedRightChild);
            }
            else if (rightRootNode instanceof CommutativeJoinNode) {
                return liftRightCommutativeJoin(liftedRightChild);
            }
            else
                return updateConditionAndRightChild(
                        ljCondition.filter(c -> !liftedRightChild.isDeclaredAsEmpty()),
                        liftedRightChild);
        }

        private LJNormalizationState liftRightConstruction(IQTree rightGrandChild,
                                                           ImmutableSubstitution<ImmutableTerm> rightSubstitution,
                                                           VariableGenerator variableGenerator) {

            // Empty substitution -> replace the construction node by its child
            if (rightSubstitution.isEmpty())
                return updateConditionAndRightChild(ljCondition, rightGrandChild);

            ImmutableSet<Variable> leftVariables = leftChild.getVariables();

            Optional<Map.Entry<Variable, Constant>> excludedEntry = extractExcludedEntry(rightSubstitution);

            ImmutableSubstitution<ImmutableTerm> selectedSubstitution = excludedEntry
                    .map(excluded -> rightSubstitution.getImmutableMap().entrySet().stream()
                            .filter(e -> !e.equals(excluded))
                            .collect(ImmutableCollectors.toMap()))
                    .map(substitutionFactory::getSubstitution)
                    .orElse(rightSubstitution);

            // Empty selected substitution -> nothing to do
            if (selectedSubstitution.isEmpty())
                return this;

            Optional<ImmutableExpression> notOptimizedLJCondition = applyRightSubstitutionToLJCondition(
                    ljCondition, selectedSubstitution, leftVariables);

            Optional<RightProvenance> rightProvenance = excludedEntry
                    .map(e -> createProvenanceElements(e, rightGrandChild))
                    .orElseGet(() -> createProvenanceElements(rightGrandChild, selectedSubstitution,
                            leftVariables, variableGenerator));

            IQTree newRightChild = rightProvenance
                    .flatMap(p -> p.constructionNode)
                    .map(n -> (IQTree) iqFactory.createUnaryIQTree(n, rightGrandChild))
                    .orElse(rightGrandChild);

            ImmutableSubstitution<ImmutableTerm> liftableSubstitution = computeLiftableSubstitution(
                    selectedSubstitution, rightProvenance.map(e -> e.variable), leftVariables);

            ConstructionNode newParentNode = iqFactory.createConstructionNode(
                    Sets.union(leftChild.getVariables(), rightChild.getVariables()).immutableCopy(),
                    liftableSubstitution);

            return updateParentConditionRightChild(newParentNode, notOptimizedLJCondition, newRightChild);
        }

        public boolean isEmpty() {
            return leftChild.isDeclaredAsEmpty();
        }

        public IQTree createNormalizedTree(IQProperties currentIQProperties) {
            if (leftChild.isDeclaredAsEmpty())
                return iqFactory.createEmptyNode(projectedVariables);

            IQProperties normalizedProperties = currentIQProperties.declareNormalizedForOptimization();

            IQTree ljLevelTree;
            if (rightChild.isDeclaredAsEmpty()) {
                ImmutableSet<Variable> leftVariables = leftChild.getVariables();
                ImmutableSet<Variable> rightSpecificVariables = rightChild.getVariables().stream()
                        .filter(v -> !leftVariables.contains(v))
                        .collect(ImmutableCollectors.toSet());

                ConstructionNode newParentConstructionNode = iqFactory.createConstructionNode(
                        Sets.union(leftVariables, rightSpecificVariables).immutableCopy(),
                        substitutionFactory.getSubstitution(rightSpecificVariables.stream()
                                .collect(ImmutableCollectors.toMap(
                                        v -> v,
                                        v -> termFactory.getNullConstant()))));
                ljLevelTree = iqFactory.createUnaryIQTree(newParentConstructionNode, leftChild, normalizedProperties);
            }
            else if (rightChild.getRootNode() instanceof TrueNode) {
                ljLevelTree = leftChild;
            }
            else {
                ljLevelTree = iqFactory.createBinaryNonCommutativeIQTree(
                        iqFactory.createLeftJoinNode(ljCondition), leftChild, rightChild, normalizedProperties);
            }

            IQTree ancestorTree = ancestors.stream()
                    .reduce(ljLevelTree, (t, n) -> iqFactory.createUnaryIQTree(n, t),
                            // Should not be called
                            (t1, t2) -> {
                                throw new MinorOntopInternalBugException("The order must be respected");
                            });

            IQTree nonNormalizedTree = ancestorTree.getVariables().equals(projectedVariables)
                    ? ancestorTree
                    : iqFactory.createUnaryIQTree(iqFactory.createConstructionNode(projectedVariables), ancestorTree);

            // Normalizes the ancestors (recursive)
            return nonNormalizedTree.normalizeForOptimization(variableGenerator);
        }

        /**
         * TODO: explain
         *
         * Right provenance variable: always there if needed
         *   (when some definitions do not depend on a right-specific variable)
         */
        private ImmutableSubstitution<ImmutableTerm> computeLiftableSubstitution(
                ImmutableSubstitution<? extends ImmutableTerm> selectedSubstitution,
                Optional<Variable> rightProvenanceVariable, ImmutableSet<Variable> leftVariables) {

            ImmutableMap<Variable, ImmutableTerm> newMap;
            if (rightProvenanceVariable.isPresent()) {
                newMap = selectedSubstitution.getImmutableMap().entrySet().stream()
                        .filter(e -> !leftVariables.contains(e.getKey()))
                        .collect(ImmutableCollectors.toMap(
                                Map.Entry::getKey,
                                e -> transformRightSubstitutionValue(e.getValue(), leftVariables,
                                        rightProvenanceVariable.get())));
            }
            else {
                newMap = selectedSubstitution.getImmutableMap().entrySet().stream()
                        .filter(e -> !leftVariables.contains(e.getKey()))
                        .collect(ImmutableCollectors.toMap(
                                Map.Entry::getKey,
                                e -> (ImmutableTerm) e.getValue()));
            }

            return substitutionFactory.getSubstitution(newMap);
        }

        private ImmutableTerm transformRightSubstitutionValue(ImmutableTerm value,
                                                              ImmutableSet<Variable> leftVariables,
                                                              Variable rightProvenanceVariable) {
            // TODO: make it stronger!!
            if (value.getVariableStream()
                    .anyMatch(v -> !leftVariables.contains(v)))
                return value;

            return termFactory.getImmutableFunctionalTerm(
                    IF_ELSE_NULL,
                    termFactory.getImmutableExpression(IS_NOT_NULL, rightProvenanceVariable),
                    value);
        }

        /**
         * Selects the entries that can be applied to the right child.
         *
         * Useful when there is an equality between two variables defined on the right (otherwise would not converge)
         */
        private ImmutableSubstitution<NonFunctionalTerm> selectDownSubstitution(
                ImmutableSubstitution<NonFunctionalTerm> simplificationSubstitution, ImmutableSet<Variable> rightVariables) {
            ImmutableMap<Variable, NonFunctionalTerm> newMap = simplificationSubstitution.getImmutableMap().entrySet().stream()
                    .filter(e -> rightVariables.contains(e.getKey()))
                    .collect(ImmutableCollectors.toMap());
            return substitutionFactory.getSubstitution(newMap);
        }

        private Optional<RightProvenance> createProvenanceElements(Map.Entry<Variable, Constant> provenanceVariableDefinition,
                                                                   IQTree rightTree) {
            Variable rightProvenanceVariable = provenanceVariableDefinition.getKey();

            ImmutableSet<Variable> newRightProjectedVariables =
                    Stream.concat(Stream.of(rightProvenanceVariable),
                            rightTree.getVariables().stream())
                            .collect(ImmutableCollectors.toSet());

            ConstructionNode newRightConstructionNode = iqFactory.createConstructionNode(
                    newRightProjectedVariables,
                    substitutionFactory.getSubstitution(rightProvenanceVariable, provenanceVariableDefinition.getValue()));

            return Optional.of(new RightProvenance(rightProvenanceVariable, newRightConstructionNode));
        }

        /**
         * When at least one value does not depend on a right-specific variable
         *   (i.e. is a ground term or only depends on left variables)
         */
        private Optional<RightProvenance> createProvenanceElements(IQTree rightTree,
                                                                   ImmutableSubstitution<? extends ImmutableTerm> selectedSubstitution,
                                                                   ImmutableSet<Variable> leftVariables,
                                                                   VariableGenerator variableGenerator) {

            if (selectedSubstitution.getImmutableMap().entrySet().stream()
                    .filter(e -> !leftVariables.contains(e.getKey()))
                    .map(Map.Entry::getValue)
                    .anyMatch(value -> !isNullWhenRightIsRejected(value, leftVariables))) {

                VariableNullability rightNullability = rightTree.getVariableNullability();

                Optional<Variable> nonNullableRightVariable = rightTree.getVariables().stream()
                        .filter(v -> !leftVariables.contains(v))
                        .filter(v -> !rightNullability.isPossiblyNullable(v))
                        .findFirst();

                if (nonNullableRightVariable.isPresent()) {
                    return Optional.of(new RightProvenance(nonNullableRightVariable.get()));
                }
                /*
                 * Otherwise, creates a fresh variable and its construction node
                 */
                else {
                    Variable provenanceVariable = variableGenerator.generateNewVariable();

                    ImmutableSet<Variable> newRightProjectedVariables =
                            Stream.concat(
                                    Stream.of(provenanceVariable),
                                    rightTree.getVariables().stream())
                                    .collect(ImmutableCollectors.toSet());

                    ConstructionNode newRightConstructionNode = iqFactory.createConstructionNode(
                            newRightProjectedVariables,
                            substitutionFactory.getSubstitution(provenanceVariable,
                                    termFactory.getProvenanceSpecialConstant()));

                    return Optional.of(new RightProvenance(provenanceVariable, newRightConstructionNode));
                }
            }
            else {
                return Optional.empty();
            }
        }

        /**
         *
         * Return true when the term is guaranteed to be NULL when the right is rejected
         *
         *
         */
        private boolean isNullWhenRightIsRejected(ImmutableTerm immutableTerm, ImmutableSet<Variable> leftVariables) {
            if (immutableTerm instanceof Constant)
                return ((Constant) immutableTerm).isNull();

            // TODO: make it stronger (is a bit weak, as some functional terms may tolerate NULLs for the right)
            return immutableTerm.getVariableStream()
                    .anyMatch(v -> !leftVariables.contains(v));
        }

        @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
        private Optional<ImmutableExpression> applyRightSubstitutionToLJCondition(
                Optional<ImmutableExpression> ljCondition,
                ImmutableSubstitution<ImmutableTerm> selectedSubstitution,
                ImmutableSet<Variable> leftVariables) {

            Stream<ImmutableExpression> equalitiesToInsert = selectedSubstitution.getImmutableMap().entrySet().stream()
                    .filter(e -> leftVariables.contains(e.getKey()))
                    .map(e -> termFactory.getImmutableExpression(EQ, e.getKey(), e.getValue()));

            return termFactory.getConjunction(
                    Stream.concat(
                            ljCondition
                                    .map(selectedSubstitution::applyToBooleanExpression)
                                    .map(Stream::of)
                                    .orElseGet(Stream::empty),
                            equalitiesToInsert));
        }

        private Optional<Map.Entry<Variable, Constant>> extractExcludedEntry(ImmutableSubstitution<ImmutableTerm> rightSubstitution) {
            Constant specialProvenanceConstant = termFactory.getProvenanceSpecialConstant();

            return rightSubstitution.getImmutableMap().entrySet().stream()
                    .filter(e -> (e.getValue().equals(specialProvenanceConstant)))
                    .map(e -> Maps.immutableEntry(e.getKey(), specialProvenanceConstant))
                    .findFirst();
        }
    }

    /**
     * Elements that keep track that the right part contributed to the intermediate results:
     *
     * - Variable: right-specific, not nullable on the right
     * - Construction node (optional): defines the provenance variable (when the latter is not defined by an atom)
     */
    private static class RightProvenance {

        public final Variable variable;
        public final Optional<ConstructionNode> constructionNode;

        private RightProvenance(Variable provenanceVariable, ConstructionNode constructionNode) {
            this.variable = provenanceVariable;
            this.constructionNode = Optional.of(constructionNode);
        }

        private RightProvenance(Variable rightProvenanceVariable) {
            this.variable = rightProvenanceVariable;
            this.constructionNode = Optional.empty();
        }
    }
}
