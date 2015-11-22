package com.jorgefigueiredo.algorithms;

import junit.framework.TestCase;

public class RecursionAlgorithmsTest extends TestCase {

    public void testFactorial() {

        assertEquals(1, RecursionAlgorithms.Factorial.calc(0));
        assertEquals(1, RecursionAlgorithms.Factorial.calc(1));
        assertEquals(2, RecursionAlgorithms.Factorial.calc(2));
        assertEquals(6, RecursionAlgorithms.Factorial.calc(3));
        assertEquals(24, RecursionAlgorithms.Factorial.calc(4));
    }

}
