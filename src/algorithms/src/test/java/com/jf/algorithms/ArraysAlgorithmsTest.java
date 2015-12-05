package com.jf.algorithms;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysAlgorithmsTest extends TestCase {

    public void testReverseV1() {

        Integer[] input = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        ArraysAlgorithms.Rotate_V1.rotate(input, 3);

        Integer[] result = new Integer[] { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        assertTrue(Arrays.equals(input, result));
    }

    public void testReorderWithIndexArray() {

        Integer[] array = new Integer[] { 10, 11, 12 };
        Integer[] index = new Integer[] { 1, 0, 2 };

        ArraysAlgorithms.ReorderByIndexArray.reorder(array, index);

        Integer[] result = new Integer[] { 11, 10, 12};
        assertTrue(Arrays.equals(array, result));

    }

    public void testReorderWithIndexArray2() {

        Integer[] array = new Integer[] { 50, 40, 70, 60, 90 };
        Integer[] index = new Integer[] { 3,  0,  4,  1,  2 };

        ArraysAlgorithms.ReorderByIndexArray.reorder(array, index);

        Integer[] result = new Integer[] { 40, 60, 90, 50, 70};
        assertTrue(Arrays.equals(array, result));

    }

    public void testCountFrequencies() {

        Integer[] input = new Integer[] { 2, 3, 3, 2, 5 };

        ArraysAlgorithms.CountFrequencies.count(input);

        assertEquals(new Integer(0), input[0]);
        assertEquals(new Integer(-2), input[1]);
        assertEquals(new Integer(-2), input[2]);
        assertEquals(new Integer(0), input[3]);
        assertEquals(new Integer(-1), input[4]);
    }

    public void testFindPeakElement() {

        assertEquals(new Integer(20), ArraysAlgorithms.FindPeakElement.get(new Integer[] { 5, 10, 20, 15 }));
        assertEquals(new Integer(50), ArraysAlgorithms.FindPeakElement.get(new Integer[] { 10, 20, 30, 40, 50 }));
        assertEquals(new Integer(100), ArraysAlgorithms.FindPeakElement.get(new Integer[] { 100, 80, 60, 50, 20 }));
        assertEquals(new Integer(5), ArraysAlgorithms.FindPeakElement.get(new Integer[] { 5, 5, 5, 5 }));

    }

    public void testMedian() {

        assertEquals(3, ArraysAlgorithms.FindMedian.find(new int[] { 1, 5, 4, 3, 2 }));
        assertEquals(4, ArraysAlgorithms.FindMedian.find(new int[] { 1, 6, 5, 4, 3, 2 }));

    }


    public void testFindPairsSum() {

        int[] input = new int[] { 1, 4, 45, 6, 10, 8 };
        int sum = 16;

        List<String> result = new LinkedList<String>();
        result.add("10-6");

        assertEquals(result, ArraysAlgorithms.FindPairsSum.find1(input, 16));
        assertEquals(result, ArraysAlgorithms.FindPairsSum.find2(input, 16));
    }

    public void testTripletsSum() {

        int[] input = new int[] { 5, 1, 3, 4, 7 };
        int sum = 12;

        assertEquals(4, ArraysAlgorithms.TripletsSum.countTripletsLessThanSum(input, sum));
        assertEquals(4, ArraysAlgorithms.TripletsSum.countTripletsLessThanSum2(input, sum));

    }

}
