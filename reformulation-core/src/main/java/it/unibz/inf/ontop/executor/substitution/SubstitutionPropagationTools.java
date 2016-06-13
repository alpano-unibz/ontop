package it.unibz.inf.ontop.executor.substitution;


import java.util.Optional;

import com.google.common.collect.ImmutableSet;
import it.unibz.inf.ontop.model.ImmutableSubstitution;
import it.unibz.inf.ontop.model.ImmutableTerm;
import it.unibz.inf.ontop.model.Variable;
import it.unibz.inf.ontop.pivotalrepr.*;
import it.unibz.inf.ontop.pivotalrepr.NonCommutativeOperatorNode.ArgumentPosition;
import it.unibz.inf.ontop.pivotalrepr.impl.QueryTreeComponent;
import it.unibz.inf.ontop.pivotalrepr.proposal.NodeCentricOptimizationResults;
import it.unibz.inf.ontop.pivotalrepr.proposal.ReactToChildDeletionProposal;
import it.unibz.inf.ontop.pivotalrepr.proposal.ReactToChildDeletionResults;
import it.unibz.inf.ontop.pivotalrepr.proposal.impl.NodeCentricOptimizationResultsImpl;
import it.unibz.inf.ontop.pivotalrepr.proposal.impl.ReactToChildDeletionProposalImpl;

import java.util.LinkedList;
import java.util.Queue;

import static it.unibz.inf.ontop.pivotalrepr.unfolding.ProjectedVariableExtractionTools.extractProjectedVariables;

/**
 * These methods are only accessible by InternalProposalExecutors (requires access to the QueryTreeComponent).
 */
public class SubstitutionPropagationTools {

    /**
     * Propagates the substitution to the descendants of the focus node.
     *
     * THE SUBSTITUTION IS NOT APPLIED TO THE FOCUS NODE.
     *
     * Has-side effect on the tree component.
     * Returns the updated tree component
     *
     */
    public static QueryTreeComponent propagateSubstitutionDown(final QueryNode focusNode,
                                                               final ImmutableSubstitution<? extends ImmutableTerm> currentSubstitutionToPropagate,
                                                               final IntermediateQuery query,
                                                               final QueryTreeComponent treeComponent)
            throws QueryNodeSubstitutionException {

        Queue<QueryNode> nodesToVisit = new LinkedList<>();
        nodesToVisit.addAll(treeComponent.getCurrentSubNodesOf(focusNode));

        while (!nodesToVisit.isEmpty()) {
            QueryNode formerSubNode = nodesToVisit.poll();

            SubstitutionResults<? extends QueryNode> substitutionResults =
                    formerSubNode.applyDescendingSubstitution(currentSubstitutionToPropagate, query);

            Optional<? extends QueryNode> optionalNewSubNode = substitutionResults.getOptionalNewNode();
            Optional<? extends ImmutableSubstitution<? extends ImmutableTerm>> optionalNewSubstitution
                    = substitutionResults.getSubstitutionToPropagate();

            /**
             * Still a substitution to propagate
             */
            if (optionalNewSubstitution.isPresent()) {
                ImmutableSubstitution<? extends ImmutableTerm> newSubstitution = optionalNewSubstitution.get();

                /**
                 * No substitution change
                 */
                if (newSubstitution.equals(currentSubstitutionToPropagate)) {
                    /**
                     * Normal case: applies the same substitution to the children
                     */
                    if (optionalNewSubNode.isPresent()) {
                        QueryNode newSubNode = optionalNewSubNode.get();

                        nodesToVisit.addAll(treeComponent.getCurrentSubNodesOf(formerSubNode));
                        treeComponent.replaceNode(formerSubNode, newSubNode);
                    }
                    /**
                     * The sub-node is not needed anymore
                     */
                    else {
                        nodesToVisit.addAll(treeComponent.getCurrentSubNodesOf(formerSubNode));
                        treeComponent.removeOrReplaceNodeByUniqueChildren(formerSubNode);
                    }
                }
                /**
                 * New substitution: applies it to the children
                 */
                else if (optionalNewSubNode.isPresent())  {

                    QueryNode newSubNode = optionalNewSubNode.get();
                    treeComponent.replaceNode(formerSubNode, newSubNode);

                    // Recursive call
                    propagateSubstitutionDown(newSubNode, newSubstitution, query, treeComponent);
                }
                /**
                 * Unhandled case: new substitution to apply to the children of
                 * a not-needed node.
                 *
                 * TODO: should we handle this case
                 */
                else {
                    throw new RuntimeException("Unhandled case: new substitution to apply to the children of " +
                            "a not-needed node.");
                }
            }
            /**
             * Stops the propagation
             */
            else {
                if (optionalNewSubNode.isPresent()) {
                    QueryNode newSubNode = optionalNewSubNode.get();
                    treeComponent.replaceNode(formerSubNode, newSubNode);
                }
                else {
                    throw new RuntimeException("Unhandled case: the stopping node for the propagation" +
                            "is not needed anymore. Should we support it?");
                }
            }
        }
        return treeComponent;
    }

    /**
     * Propagates the substitution to the ancestors of the focus node.
     *
     * THE SUBSTITUTION IS NOT APPLIED TO THE FOCUS NODE nor to its siblings.
     *
     * Has-side effect on the tree component.
     *
     * Note that some ancestors may become empty and thus the focus node and its siblings be removed.
     *
     * TODO: clean
     *
     */
    public static <T extends QueryNode> NodeCentricOptimizationResults<T> propagateSubstitutionUp(
            T focusNode, ImmutableSubstitution<? extends ImmutableTerm> substitutionToPropagate,
            IntermediateQuery query, QueryTreeComponent treeComponent) throws QueryNodeSubstitutionException,
            EmptyQueryException {

        // Non-final
        Optional<QueryNode> optionalCurrentAncestor = query.getParent(focusNode);

        // Non-final
        ImmutableSubstitution<? extends ImmutableTerm> currentSubstitution = substitutionToPropagate;


        while (optionalCurrentAncestor.isPresent()) {
            final QueryNode currentAncestor = optionalCurrentAncestor.get();

            final Optional<QueryNode> optionalNextAncestor = query.getParent(currentAncestor);

            /**
             * Applies the substitution and analyses the results
             */
            SubstitutionResults<? extends QueryNode> substitutionResults = currentAncestor.applyAscendingSubstitution(
                    currentSubstitution, focusNode, query);

            switch (substitutionResults.getLocalAction()) {
                case NO_CHANGE:
                    break;
                case NEW_NODE:
                    QueryNode newAncestor = substitutionResults.getOptionalNewNode().get();
                    if (currentAncestor != newAncestor) {
                        treeComponent.replaceNode(currentAncestor, newAncestor);
                    }
                    break;
                case INSERT_CONSTRUCTION_NODE:
                    substitutionResults.getOptionalNewNode()
                            .ifPresent(updatedAncestor -> {
                                if (currentAncestor != updatedAncestor) {
                                    treeComponent.replaceNode(currentAncestor, updatedAncestor);
                                }});

                    ConstructionNode newParentOfDescendantNode = substitutionResults
                            .getOptionalNewParentOfDescendantNode().get();
                    QueryNode descendantNode = substitutionResults.getOptionalDescendantNode().get();
                    treeComponent.insertParent(descendantNode, newParentOfDescendantNode);
                    break;

                case REPLACE_BY_CHILD:
                    /**
                     * If a position is specified, removes the other children
                     */
                    substitutionResults.getOptionalReplacingChildPosition()
                            .ifPresent(position -> query.getChildren(currentAncestor).stream()
                                    // Not the same position
                                    .filter(c -> query.getOptionalPosition(currentAncestor, c)
                                            .filter(p -> ! p.equals(position))
                                            .isPresent())
                                    .forEach(treeComponent::removeSubTree));

                    // Assume there is only one child
                    treeComponent.removeOrReplaceNodeByUniqueChildren(currentAncestor);
                    break;
                /**
                 * Ancestor is empty --> applies a ReactToChildDeletionProposal and returns the remaining ancestor
                 */
                case DECLARE_AS_EMPTY:
                    return reactToEmptinessDeclaration(optionalNextAncestor, query, currentAncestor, treeComponent);
                default:
                    throw new IllegalStateException("Unknown local action: " + substitutionResults.getLocalAction());
            }

            Optional<? extends ImmutableSubstitution<? extends ImmutableTerm>> optionalNewSubstitution =
                    substitutionResults.getSubstitutionToPropagate();

            /**
             * Continue the propagation
             */
            if (optionalNewSubstitution.isPresent()) {

                // Continue with these values
                currentSubstitution = optionalNewSubstitution.get();
                optionalCurrentAncestor = optionalNextAncestor;
            }
            /**
             * Or stop it
             */
            else {
                // Stops
                optionalCurrentAncestor = Optional.empty();
            }
        }

        /**
         * If no ancestor has been
         */
        return new NodeCentricOptimizationResultsImpl<>(query, focusNode);
    }

    private static <T extends QueryNode> NodeCentricOptimizationResults<T> reactToEmptinessDeclaration(
            Optional<QueryNode> optionalNextAncestor, IntermediateQuery query, QueryNode currentAncestor,
            QueryTreeComponent treeComponent) throws EmptyQueryException {
        QueryNode ancestorParent = optionalNextAncestor
                .orElseThrow(EmptyQueryException::new);

        ImmutableSet<Variable> nullVariables = extractProjectedVariables(query, currentAncestor);
        Optional<QueryNode> optionalNextSibling = query.getNextSibling(currentAncestor);
        Optional<ArgumentPosition> optionalPosition = query.getOptionalPosition(ancestorParent, currentAncestor);

        treeComponent.removeSubTree(currentAncestor);

        ReactToChildDeletionProposal reactionProposal = new ReactToChildDeletionProposalImpl(
                ancestorParent, optionalNextSibling, optionalPosition, nullVariables);

        // In-place optimization (returns the same query)
        ReactToChildDeletionResults reactionResults = query.applyProposal(reactionProposal, true);

        // Only returns the closest remaining ancestor
        return new NodeCentricOptimizationResultsImpl<>(query, Optional.empty(),
                Optional.of(reactionResults.getClosestRemainingAncestor()));
    }
}