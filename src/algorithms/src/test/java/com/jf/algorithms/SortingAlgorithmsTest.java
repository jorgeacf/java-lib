package com.jf.algorithms;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortingAlgorithmsTest extends TestCase {

    public void testMergeSort() {

        Integer[] a = new Integer[] { 3, 1, 5, 4, 7, 6, 2, 8 };

        SortingAlgorithms.Merge.sort(a);

        Integer[] expected = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(expected, a));

    }

    public void testQuickSort() {

        Integer[] a = new Integer[] { 3, 1, 5, 7, 6, 2, 8, 4 };

        SortingAlgorithms.Quick.sort(a);

        Integer[] expected = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(expected, a));

    }

    public void testQuickSort_PivotIsLastItemOfInput() {

        Integer[] a = new Integer[] { 3, 1, 5, 4, 7, 6, 2, 8 };

        SortingAlgorithms.Quick.sort(a);

        Integer[] expected = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(expected, a));

    }

    public void testPartition() {

        Integer[] a = new Integer[] { 12, 7, 14, 9, 10, 11 };

        int p = SortingAlgorithms.Quick.partitioning(a);

        assertEquals(3, p);

    }

}
