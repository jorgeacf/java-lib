package com.jf.algorithms.arrays;

import junit.framework.TestCase;

import java.util.Arrays;

public class RotateTest extends TestCase {

    public void testRotateKEqual3() {

        Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        Rotate.rotate(input, 3);

        Integer[] output = new Integer[] { 6, 7, 8, 1, 2, 3, 4, 5 };

        assertTrue(Arrays.equals(input, output));

    }

    public void testRotateKEqualMinus3() {

        Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        Rotate.rotate(input, -3);

        Integer[] output = new Integer[] { 4, 5, 6, 7, 8, 1, 2, 3 };

        assertTrue(Arrays.equals(input, output));

    }

}
