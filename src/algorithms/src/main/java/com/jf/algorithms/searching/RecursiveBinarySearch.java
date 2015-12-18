package com.jf.algorithms.searching;

public final class RecursiveBinarySearch {


    public static int search(Comparable[] inputArray, Comparable value) {

        if(inputArray == null)  { throw new IllegalArgumentException("The parameter inputArray can't be null."); }
        if(value == null)       { throw new IllegalArgumentException("The parameter value can't be null."); }

        return search(inputArray, value, 0, inputArray.length);
    }

    private static int search(Comparable[] inputArray, Comparable value, int lo, int hi) {

        if(hi <= lo) { return -1; }

        int mid = lo + ((hi-lo) / 2);

        if(inputArray[mid].compareTo(value) == 0) { return mid; }
        else if(value.compareTo(inputArray[mid]) < 0) { return search(inputArray, value, lo, mid); }
        else if(value.compareTo(inputArray[mid]) > 0) { return search(inputArray, value, mid + 1, hi); }

        return -1;
    }

}
