package it.unibz.inf.ontop.executor;

import java.util.Optional;
import com.google.common.collect.ImmutableList;
import it.unibz.inf.ontop.pivotalrepr.EmptyQueryException;
import it.unibz.inf.ontop.pivotalrepr.IntermediateQuery;
import it.unibz.inf.ontop.pivotalrepr.impl.QueryTreeComponent;
import it.unibz.inf.ontop.pivotalrepr.proposal.InvalidQueryOptimizationProposalException;
import it.unibz.inf.ontop.pivotalrepr.proposal.ProposalResults;
import it.unibz.inf.ontop.pivotalrepr.proposal.QueryOptimizationProposal;

import java.util.Iterator;

/**
 * TODO: explain
 */
public abstract class InternalCompositeExecutor<P extends QueryOptimizationProposal<R>, R extends ProposalResults>
        implements ProposalExecutor<P, R> {

    @Override
    public R apply(final P initialProposal, IntermediateQuery query, final QueryTreeComponent treeComponent)
            throws InvalidQueryOptimizationProposalException, EmptyQueryException {

        ImmutableList<? extends ProposalExecutor<P, R>> executors = getExecutors();
        Iterator<? extends ProposalExecutor<P, R>> executorIterator = executors.iterator();

        // Non-final
        Optional<P> optionalProposal = Optional.of(initialProposal);

        R results;
        do {
            ProposalExecutor<P, R> executor = executorIterator.next();

            results = executor.apply(optionalProposal.get(), query, treeComponent);
            optionalProposal = createNewProposal(results);

        } while(optionalProposal.isPresent() && executorIterator.hasNext());

        return results;
    }

    protected abstract Optional<P> createNewProposal(R results);

    protected abstract ImmutableList<? extends ProposalExecutor<P, R>> getExecutors();


}
