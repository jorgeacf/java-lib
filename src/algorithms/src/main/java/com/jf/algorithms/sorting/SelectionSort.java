package com.jf.algorithms.sorting;

import com.jf.utils.ArrayUtils;

public final class SelectionSort {

    private SelectionSort() {}

    /**
     * This method order the inputArray using the Selection Sort algorithm.
     * The running cost time is O(n^3), and the space cost is O(1).
     * @param inputArray Input array to be sorted.
     */
    public static void sort(Comparable[] inputArray) {

        if(inputArray == null) { throw new IllegalArgumentException("The inputArray can't be null."); }

        int len = inputArray.length;

        for(int i = 0; i < len; i++) {

            int min = i;
            for(int j = i + 1; i < len; i++) {

                if(inputArray[i].compareTo(inputArray[min]) < 0) {
                    min = j;
                }

            }
            ArrayUtils.exchange(inputArray, i, min);
        }


    }

}
