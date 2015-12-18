package com.jf.algorithms.arrays;

import junit.framework.TestCase;

import java.util.Arrays;

public class ReorderArrayByIndexArrayTest extends TestCase {


    public void testSmallArray() {

        Integer[] array = new Integer[] { 10, 11, 12 };
        Integer[] index = new Integer[] { 1, 0, 2 };

        ReorderArrayByIndexArray.sort(array, index);

        Integer[] result = new Integer[] { 11, 10, 12};
        assertTrue(Arrays.equals(array, result));

    }

    public void testLargeArray() {

        Integer[] array = new Integer[] { 50, 40, 70, 60, 90 };
        Integer[] index = new Integer[] { 3,  0,  4,  1,  2 };

        ReorderArrayByIndexArray.sort(array, index);

        Integer[] result = new Integer[] { 40, 60, 90, 50, 70};
        assertTrue(Arrays.equals(array, result));

    }

}
