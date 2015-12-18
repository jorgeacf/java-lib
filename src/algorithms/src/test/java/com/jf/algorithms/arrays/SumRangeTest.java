package com.jf.algorithms.arrays;

import junit.framework.TestCase;

public class SumRangeTest extends TestCase {

    public void testRangeSum() {

        Integer[] input = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        Integer output = SumRange.get(input, 4, 8);

        assertEquals(new Integer(30), output);
    }


}
