package it.unibz.inf.ontop.model.term.functionsymbol.impl.geof;

import com.google.common.collect.ImmutableList;
import it.unibz.inf.ontop.model.term.ImmutableTerm;
import it.unibz.inf.ontop.model.term.TermFactory;
import it.unibz.inf.ontop.model.type.RDFDatatype;
import org.apache.commons.rdf.api.IRI;

import javax.annotation.Nonnull;

public class GeofRcc8EqFunctionSymbolImpl  extends AbstractGeofBooleanFunctionSymbolImpl {

    public GeofRcc8EqFunctionSymbolImpl(@Nonnull IRI functionIRI, RDFDatatype wktLiteralType, RDFDatatype xsdBooleanType) {
        super("GEOF_RCC8_EQ", functionIRI, wktLiteralType, xsdBooleanType);
    }

    @Override
    protected ImmutableTerm computeDBBooleanTerm(ImmutableList<ImmutableTerm> subLexicalTerms, ImmutableList<ImmutableTerm> typeTerms, TermFactory termFactory) {
        return termFactory.getDBSTEquals(subLexicalTerms.get(0), subLexicalTerms.get(1));
    }
}