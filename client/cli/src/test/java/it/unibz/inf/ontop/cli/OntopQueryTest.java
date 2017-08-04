package it.unibz.inf.ontop.cli;

import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExternalResource;

@Ignore
public class OntopQueryTest {

    @ClassRule
    public static ExternalResource h2Connection = new H2ExternalResourceForBookExample();

    @Test
    public void testOntopQueryCMD (){
        String[] argv = {"query", "-m", "client/cli/src/test/resources/books/exampleBooks.obda",
                "-p", "client/cli/src/test/resources/books/exampleBooks.properties",
                "-t", "client/cli/src/test/resources/books/exampleBooks.owl",
                "-q", "client/cli/src/test/resources/books/q1.rq"};
        Ontop.main(argv);
    }


    @Test
    public void testOntopQueryCMD_Out (){
        String[] argv = {"query", "-m", "client/cli/src/test/resources/books/exampleBooks.obda",
                "-p", "client/cli/src/test/resources/books/exampleBooks.properties",
                "-t", "client/cli/src/test/resources/books/exampleBooks.owl",
                "-q", "client/cli/src/test/resources/books/q1.rq",
                "-o", "client/cli/src/test/resources/output/q1-answer.csv"};
        Ontop.main(argv);
    }

    @Test
    public void testOntopQueryR2RML (){
        String[] argv = {"query", "-m", "client/cli/src/test/resources/books/exampleBooks.ttl",
                "-p", "client/cli/src/test/resources/books/exampleBooks.properties",
                "-t", "client/cli/src/test/resources/books/exampleBooks.owl",
                "-q", "client/cli/src/test/resources/books/q1.rq"};
        Ontop.main(argv);
    }

    @Test
    public void testOntopQueryR2RML_noOntology (){
        String[] argv = {"query",
                "-m", "client/cli/src/test/resources/books/exampleBooks.ttl",
                "-p", "client/cli/src/test/resources/books/exampleBooks.properties",
                "-q", "client/cli/src/test/resources/books/q1.rq"};
        Ontop.main(argv);
    }

    @Ignore("too expensive")
    @Test
    public void testOntopQueryAnnotations_Ontology (){
        String[] argv = {"query",
                "-m", "client/cli/src/test/resources/pgsql/annotation/doid.obda",
                "-t", "client/cli/src/test/resources/pgsql/annotation/doid.owl",
                "-q", "client/cli/src/test/resources/pgsql/annotation/q1.q",
                "--enable-annotations"
        };
        Ontop.main(argv);
     }



}
