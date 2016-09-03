package com.jf.algorithms.arrays;

import junit.framework.TestCase;

import java.util.HashMap;

public class ElementFrequencyTest extends TestCase {

    public void testReturnTheRightFrequency() {

        Integer[] input = new Integer[] { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };

        HashMap<Integer, Integer> result = ElementFrequency.count(input);

        assertNotNull(result);
        assertEquals(7, result.size());
        assertEquals(3, result.get(1).intValue());
        assertEquals(1, result.get(2).intValue());
        assertEquals(2, result.get(3).intValue());
        assertEquals(2, result.get(5).intValue());
        assertEquals(3, result.get(8).intValue());
        assertEquals(2, result.get(9).intValue());
        assertEquals(1, result.get(10).intValue());
    }

}
