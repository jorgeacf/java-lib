package com.jf.algorithms.math;

import junit.framework.TestCase;

public class FactorialTest extends TestCase {

    public void testFactorial() {

        assertEquals(1, Factorial.calc(0));
        assertEquals(1, Factorial.calc(1));
        assertEquals(2, Factorial.calc(2));
        assertEquals(6, Factorial.calc(3));
        assertEquals(24, Factorial.calc(4));
    }

}
