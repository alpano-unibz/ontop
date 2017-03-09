package it.unibz.inf.ontop.owlrefplatform.core.optimization;

import it.unibz.inf.ontop.pivotalrepr.IntermediateQuery;

/**
 * Pushes immutable boolean expressions down into the intermediate query tree if possible.
 */
public interface PushDownBooleanExpressionOptimizer extends IntermediateQueryOptimizer {

    /**
     * Does not throw an EmptyQueryException
     */
    @Override
    IntermediateQuery optimize(IntermediateQuery query);
}
