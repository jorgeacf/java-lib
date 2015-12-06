package com.jf.algorithms.sorting;

import com.jf.algorithms.utils.ArrayUtils;

public final class InsertionSort {

    private InsertionSort() {}

    /**
     * This method sort the inputArray using the Insertion sort algorithm.
     * The running time cost is O(n^3) and the stace cost is O(1).
     * @param inputArray
     */
    public static void sort(Comparable[] inputArray) {

        if(inputArray == null) { throw new IllegalArgumentException("The inputArray can't be null."); }

        int len = inputArray.length;

        for(int i = 0; i < len; i++) {

            for(int j = i; j > 0; j--) {

                if(inputArray[j].compareTo(inputArray[j-1]) < 0) {
                    ArrayUtils.exchange(inputArray, j, j - 1);
                }
                else {
                    break;
                }
            }
        }

    }

}
