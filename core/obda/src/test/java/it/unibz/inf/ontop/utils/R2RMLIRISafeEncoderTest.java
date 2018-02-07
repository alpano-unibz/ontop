package it.unibz.inf.ontop.utils;

import org.junit.Test;

import static it.unibz.inf.ontop.utils.R2RMLIRISafeEncoder.encode;
import static org.junit.Assert.assertEquals;

public class R2RMLIRISafeEncoderTest {


    @Test
    public void testR2RMLExample() {
        assertEquals("42", encode("42"));
        assertEquals("Hello%20World%21", encode("Hello World!"));
        assertEquals("2011-08-23T22%3A17%3A00Z", encode("2011-08-23T22:17:00Z"));
        assertEquals("~A_17.1-2", encode("~A_17.1-2"));
        assertEquals("葉篤正", encode("葉篤正"));

    }
}