package it.unibz.inf.ontop.rdf4j.utils;

import it.unibz.inf.ontop.model.IriConstants;
import it.unibz.inf.ontop.model.term.BNode;
import it.unibz.inf.ontop.model.term.*;
import it.unibz.inf.ontop.model.type.RDFDatatype;
import it.unibz.inf.ontop.model.type.TermType;
import it.unibz.inf.ontop.spec.ontology.*;
import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

import java.util.Objects;

import static it.unibz.inf.ontop.model.OntopModelSingletons.TYPE_FACTORY;

public class RDF4JHelper {

	private static final ValueFactory fact = SimpleValueFactory.getInstance();

	public static Resource getResource(ObjectConstant obj) {
		if (obj instanceof BNode)
			return fact.createBNode(((BNode)obj).getName());
		else if (obj instanceof URIConstant)
			return fact.createIRI(((URIConstant)obj).getURI());
		else
            return null;
			//throw new IllegalArgumentException("Invalid constant as subject!" + obj);
	}

	/**
	 * TODO: could we have a RDF sub-class of ValueConstant?
	 */
	public static Literal getLiteral(ValueConstant literal)
	{
        Objects.requireNonNull(literal);
		TermType type = literal.getType();
		if (!(type instanceof RDFDatatype))
			// TODO: throw a proper exception
			throw new IllegalStateException("A ValueConstant given to OWLAPI must have a RDF datatype");
		RDFDatatype datatype = (RDFDatatype) type;

		if (datatype.getLanguageTag().isPresent()) {
			return fact.createLiteral(literal.getValue(), literal.getLanguage());
		}
		else {
			return fact.createLiteral(literal.getValue(), datatype.getIRI());
		}
	}

    public static Value getValue(Constant c) {
        if(c == null)
            return null;

        Value value = null;
        if (c instanceof ValueConstant) {
            value = RDF4JHelper.getLiteral((ValueConstant) c);
        } else if (c instanceof ObjectConstant){
            value = RDF4JHelper.getResource((ObjectConstant) c);
        }
        return value;
    }

	private static IRI createURI(String uri) {
		return fact.createIRI(uri);
	}

	public static Statement createStatement(Assertion assertion) {
		if (assertion instanceof ObjectPropertyAssertion) {
			return createStatement((ObjectPropertyAssertion) assertion);
		} else if (assertion instanceof DataPropertyAssertion) {
			return createStatement((DataPropertyAssertion) assertion);
		} else if (assertion instanceof ClassAssertion) {
			return createStatement((ClassAssertion) assertion);
		} else if (assertion instanceof AnnotationAssertion) {
			return createStatement((AnnotationAssertion) assertion);
	    }else {
			throw new RuntimeException("Unsupported assertion: " + assertion);
		}
	}

	private static Statement createStatement(ObjectPropertyAssertion assertion) {
		return fact.createStatement(getResource(assertion.getSubject()),
				createURI(assertion.getProperty().getPredicate().getName()),
				getResource(assertion.getObject()));
	}

	private static Statement createStatement(DataPropertyAssertion assertion) {
		return fact.createStatement(getResource(assertion.getSubject()),
				createURI(assertion.getProperty().getPredicate().getName()),
				getLiteral(assertion.getValue())
		);
	}

	private static Statement createStatement(AnnotationAssertion assertion) {
		Constant constant = assertion.getValue();

		if (constant instanceof ValueConstant) {
			return fact.createStatement(getResource(assertion.getSubject()),
					createURI(assertion.getProperty().getPredicate().getName()),
					getLiteral((ValueConstant) constant));
		} else if (constant instanceof ObjectConstant)  {
			return fact.createStatement(getResource(assertion.getSubject()),
					createURI(assertion.getProperty().getPredicate().getName()),
					getResource((ObjectConstant) constant));
		} else {
			throw new RuntimeException("Unsupported constant for an annotation property!"
					+ constant);
		}
	}

	private static Statement createStatement(ClassAssertion assertion) {
		return fact.createStatement(getResource(assertion.getIndividual()),
				createURI(IriConstants.RDF_TYPE),
				createURI(assertion.getConcept().getPredicate().getName()));
	}
}
