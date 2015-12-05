package com.jf.algorithms.searching;

import junit.framework.TestCase;

public class BinarySearchTest extends TestCase {

    public void testSearch() {

        Integer[] input = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for(int i = 0; i < input.length; i++) {

            assertEquals(i, IterativeBinarySearch.search(input, i));
            assertEquals(i, RecursiveBinarySearch.search(input, i));
        }

        assertEquals(-1, IterativeBinarySearch.search(input, -1));
        assertEquals(-1, RecursiveBinarySearch.search(input, -1));

        assertEquals(-1, IterativeBinarySearch.search(input, input.length));
        assertEquals(-1, RecursiveBinarySearch.search(input, input.length));

    }

}
