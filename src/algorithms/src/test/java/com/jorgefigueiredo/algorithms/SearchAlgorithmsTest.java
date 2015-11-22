package com.jorgefigueiredo.algorithms;

import junit.framework.TestCase;

public class SearchAlgorithmsTest extends TestCase {

    Integer[] input = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public void testBinarySearch() {

        assertEquals(0, SearchAlgorithms.BinarySearch.search(input, 0));
        assertEquals(1, SearchAlgorithms.BinarySearch.search(input, 1));
        assertEquals(2, SearchAlgorithms.BinarySearch.search(input, 2));
        assertEquals(3, SearchAlgorithms.BinarySearch.search(input, 3));
        assertEquals(4, SearchAlgorithms.BinarySearch.search(input, 4));
        assertEquals(5, SearchAlgorithms.BinarySearch.search(input, 5));
        assertEquals(6, SearchAlgorithms.BinarySearch.search(input, 6));
        assertEquals(7, SearchAlgorithms.BinarySearch.search(input, 7));
        assertEquals(8, SearchAlgorithms.BinarySearch.search(input, 8));
        assertEquals(9, SearchAlgorithms.BinarySearch.search(input, 9));

        assertEquals(-1, SearchAlgorithms.BinarySearch.search(input, -1));
        assertEquals(-1, SearchAlgorithms.BinarySearch.search(input, 10));
    }

    public void testBinarySearchNullArray() {

        try {
            SearchAlgorithms.BinarySearch.search(null, 0);
            fail("Should throw IllegalArgumentException");
        }
        catch (Exception ex) {
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }

    public void testBinarySearchOneItemDifferent() {

        assertEquals(-1, SearchAlgorithms.BinarySearch.search(new Integer[] { 1 }, 2));

    }

    public void testBinarySearchOneItemEqual() {

        assertEquals(0, SearchAlgorithms.BinarySearch.search(new Integer[] { 1 }, 1));

    }
}
