package it.unibz.inf.ontop.cli;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class OntopValidateTest {
    @Test
    public void testOntopValidateCMD (){
        String[] argv = {"validate", "-m", "src/test/resources/booktutorial.obda",
                "-t", "client/cli/src/test/resources/booktutorial.owl"};
        Ontop.main(argv);
    }
}