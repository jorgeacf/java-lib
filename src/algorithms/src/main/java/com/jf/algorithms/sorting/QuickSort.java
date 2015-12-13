package com.jf.algorithms.sorting;

import com.jf.utils.ArrayUtils;

public final class QuickSort {

    private QuickSort() {}

    /**
     * This method sorts the inputArray using the QuickSort algorithm.
     * @param inputArray
     */
    public static void sort(Comparable[] inputArray) {

        if(inputArray == null) { throw new IllegalArgumentException("The inputArray can't be null."); }

        sort(inputArray, 0, inputArray.length-1);
    }

    private static void sort(Comparable[] inputArray, int lo, int hi) {

        if(lo >= hi) { return; }

        int p = partition(inputArray, lo, hi);

        sort(inputArray, lo, p-1);
        sort(inputArray, p+1, hi);
    }

    private static int partition(Comparable[] inputArray, int lo, int hi) {

        int j = lo;
        int q = lo;
        int r = hi;

        while(j < hi) {

            if(inputArray[j].compareTo(inputArray[r]) < 0) {
                ArrayUtils.exchange(inputArray, j, q);
                q++;
            }
            j++;
        }
        ArrayUtils.exchange(inputArray, q, r);
        return q;
    }


}
