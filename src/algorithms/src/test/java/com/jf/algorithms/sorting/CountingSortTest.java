package com.jf.algorithms.sorting;

import junit.framework.TestCase;

import java.util.Arrays;

public final class CountingSortTest extends TestCase {

    public void testSortArray1() {

        Integer[] input = new Integer[] { 1, 14, 1, 20, 26, 14, 4, 25, 27, 28, 16, 9, 28, 17, 14, 3, 2, 200, 5, 20, 11, 11, 28, 26, 28, 27, 29, 22, 29, 19, 11 };

        Integer[] output = CountingSort.sort(input);

        Integer[] expectedResult = new Integer[] { 1, 1, 2, 3, 4, 5, 9, 11, 11, 11, 14, 14, 14, 16, 17, 19, 20, 20, 22, 25, 26, 26, 27, 27, 28, 28, 28, 28, 29, 29, 200 };

        assertTrue(Arrays.equals(output, expectedResult));
    }

    public void testSortArray2() {

        Integer[] input = new Integer[] { 1, 14, 1, 20, 26, 14, 4, 25, 27, 28, 16, 9, 28, 17, 14, 3, 2, 5, 20, 11, 11, 28, 26, 28, 27, 29, 22, 29, 19, 11 };

        Integer[] output = CountingSort.sort(input);

        Integer[] expectedResult = new Integer[] { 1, 1, 2, 3, 4, 5, 9, 11, 11, 11, 14, 14, 14, 16, 17, 19, 20, 20, 22, 25, 26, 26, 27, 27, 28, 28, 28, 28, 29, 29 };

        assertTrue(Arrays.equals(output, expectedResult));
    }

}
