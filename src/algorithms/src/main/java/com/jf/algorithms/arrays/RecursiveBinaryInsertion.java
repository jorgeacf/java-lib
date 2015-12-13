package com.jf.algorithms.arrays;

import com.jf.utils.ArrayUtils;

public final class RecursiveBinaryInsertion {

    private RecursiveBinaryInsertion() { }

    public static void insert(Comparable[] inputArray, Comparable value) {

        if(inputArray == null) { throw new IllegalArgumentException("The parameter inputArray can't be null."); }
        if(value == null) { throw new IllegalArgumentException("The parameter value can't be null."); }

        int m = search(inputArray, value, 0, inputArray.length-1);

        int i = inputArray.length - 1;
        while(i > m) {

            ArrayUtils.exchange(inputArray, i, i - 1);
            i--;
        }
        inputArray[m] = value;
    }

    private static int search(Comparable[] inputArray, Comparable value, int lo, int hi) {

        if(lo >= hi) { return value.compareTo(inputArray[lo]) < 0 ? lo : hi; }

        int mid = lo + ((hi-lo) / 2);
        if(value.compareTo(inputArray[mid]) > 0 && value.compareTo(inputArray[mid+1]) < 0) { return mid + 1; }
        else if(value.compareTo(inputArray[mid]) < 0)   { return search(inputArray, value, lo, mid); }
        else if(value.compareTo(inputArray[mid+1]) > 0) { return search(inputArray, value, mid+2, hi); }

        return -1;
    }

}
