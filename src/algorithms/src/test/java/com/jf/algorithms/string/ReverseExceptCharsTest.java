package com.jf.algorithms.string;

import junit.framework.TestCase;

public class ReverseExceptCharsTest extends TestCase {

    public void testReverseString() {

        String input = "Ab,c,de!$";
        String specialCaracters = ",!$";

        String output = ReverseExceptChars.reverse(input, specialCaracters);
        String expected = "ed,c,bA!$";

        assertEquals(expected, output);

    }

}
