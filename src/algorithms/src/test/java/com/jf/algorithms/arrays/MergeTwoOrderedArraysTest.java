package com.jf.algorithms.arrays;

import junit.framework.TestCase;

import java.util.Arrays;

public class MergeTwoOrderedArraysTest extends TestCase {

    public void testMergeTwoArrays() {
        int[] inputA = new int[] { 7, 5, 3, 1 };
        int[] inputB = new int[] { 9, 8, 6, 2, 0 };
        int[] result = MergeTwoOrderedArrays.merge(inputA, inputB);
        assertTrue(Arrays.equals(result, new int[] { 9, 8, 7, 6, 5, 3, 2, 1, 0 }));
    }

}
