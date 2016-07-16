package com.jf.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore("javax.management.*")
public class ArrayUtilsTest {

    @Test
    public void testExchangeElementInAnArray() {
        Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };
        ArrayUtils.exchange(input, 2, 3);
        assertTrue(Arrays.equals(input, new Integer[] {1, 2, 4, 3, 5}));
        ArrayUtils.exchange(input, 0, 1);
        assertTrue(Arrays.equals(input, new Integer[] {2, 1, 4, 3, 5}));
        ArrayUtils.exchange(input, 3, 4);
        assertTrue(Arrays.equals(input, new Integer[] {2, 1, 4, 5, 3}));
    }

    @Test
    public void testReverseArray() {
        Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };
        ArrayUtils.reverse(input);
        assertTrue(Arrays.equals(input, new Integer[] { 5, 4, 3, 2, 1}));
    }

    @Test
    public void testPrintValues() {
        Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };
        String result = ArrayUtils.printValues(input);
        String expectedResult = "[1, 2, 3, 4, 5]";
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGettingArrayMinimum() {
        Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };
        Integer result = ArrayUtils.min(input);
        Integer expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGettingArrayMaximum() {
        Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };
        Integer result = ArrayUtils.max(input);
        Integer expectedResult = 5;
        assertEquals(expectedResult, result);
    }
}
