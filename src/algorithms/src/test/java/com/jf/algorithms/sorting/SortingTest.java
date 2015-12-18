package com.jf.algorithms.sorting;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortingTest extends TestCase {


    public void testSort() {

        Integer[] input = new Integer[]{3, 1, 8, 5, 6, 9, 4, 7, 2};

        Integer[] output = Arrays.copyOf(input, input.length);

        //ShellSort.sort(input);
        //QuickSort.sort(input);
        //MergeSort.sort(input);
        BubbleSort.sort(input);

        Arrays.sort(output);
        assertTrue(Arrays.equals(input, output));
    }
}
