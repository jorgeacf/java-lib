package com.jf.algorithms.arrays;

import junit.framework.TestCase;

import java.util.Arrays;

public final class RecursiveBinaryInsertionTest extends TestCase {


    public void testInsert() {

        Integer[] input = new Integer[] { 0, 1, 3, 4, 5 };

        RecursiveBinaryInsertion.insert(input, 2);

        assertTrue(Arrays.equals(new Integer[] { 0, 1, 2, 3, 4 }, input));

    }

    public void testInsert2() {

        Integer[] input = new Integer[] { 0, 1, 3, 4, 5 };

        RecursiveBinaryInsertion.insert(input, 9);

        assertTrue(Arrays.equals(new Integer[] { 0, 1, 3, 4, 9 }, input));

    }

    public void testInsert3() {

        Integer[] input = new Integer[] { 0, 2};

        RecursiveBinaryInsertion.insert(input, 1);

        assertTrue(Arrays.equals(new Integer[] { 0, 1 }, input));

    }

    public void testInsert4() {

        Integer[] input = new Integer[] { 1, 2 };

        RecursiveBinaryInsertion.insert(input, 0);

        assertTrue(Arrays.equals(new Integer[] { 0, 1}, input));

    }

    public void testInsert5() {

        Integer[] input = new Integer[] { 1 };

        RecursiveBinaryInsertion.insert(input, 0);

        assertTrue(Arrays.equals(new Integer[] { 0 }, input));

    }

}
