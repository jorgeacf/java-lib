package com.jf.algorithms.sorting;

public final class MergeSort {

    private MergeSort() {}

    /**
     *
     * @param inputArray
     */
    public static void sort(Comparable[] inputArray) {

        if(inputArray == null) { throw new IllegalArgumentException("The inputArray can't be null."); }

        int N = inputArray.length;

        Comparable[] aux = new Comparable[N];
        sort(inputArray, aux, 0, inputArray.length);

    }

    private static void sort(Comparable[] inputArray, Comparable[] aux, int lo, int hi) {

        if(hi - lo <= 1) { return; }

        int mid = ((hi-lo) / 2) + lo;

        sort(inputArray, aux, lo, mid);
        sort(inputArray, aux, mid, hi);

        merge(inputArray, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] inputArray, Comparable[] aux, int lo, int mid, int hi) {

        int i = lo;
        int j = mid;

        for(int k = lo; k < hi; k++) {

            if      (i == mid)                                      { aux[k - lo] = inputArray[j++]; }
            else if (j == hi)                                       { aux[k - lo] = inputArray[i++]; }
            else if (inputArray[i].compareTo(inputArray[j]) > 0)    { aux[k - lo] = inputArray[j++]; }
            else                                                    { aux[k - lo] = inputArray[i++]; }

        }

        for(int k = lo; k < hi; k++) {
            inputArray[k] = aux[k - lo];
        }

    }

}
