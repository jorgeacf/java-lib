package com.jf.algorithms.arrays;

import junit.framework.TestCase;

public class FindPeakElementTest extends TestCase {

    public void testValidPeakElementWithLargeArray() {

        Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1 };

        Comparable<Integer> result = FindPeakElement.find(input);

        assertEquals(new Integer(8), result);
    }

    public void testWithoutPeakElementWithLargeArray() {

        Integer[] input = new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        Comparable<Integer> result = FindPeakElement.find(input);

        assertNull(result);

    }

    public void testAscendingItemsWithPeakElementWithLargeArray() {

        Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Comparable<Integer> result = FindPeakElement.find(input);

        assertEquals(new Integer(9), result);

    }

    public void testDescendingItemsWithPeakElementWithLargeArray() {

        Integer[] input = new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        Comparable<Integer> result = FindPeakElement.find(input);

        assertEquals(new Integer(9), result);

    }

}
