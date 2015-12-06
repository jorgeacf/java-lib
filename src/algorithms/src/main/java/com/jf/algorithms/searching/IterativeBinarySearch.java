package com.jf.algorithms.searching;

public final class IterativeBinarySearch {

    public static int search(Comparable[] inputArray, Comparable value) {

        if(inputArray == null) { throw new IllegalArgumentException("The parameter inputArray can't be null."); }
        if(value == null) { throw new IllegalArgumentException("The parameter value can't be null."); }

        int lo = 0;
        int hi = inputArray.length - 1;

        while(hi >= lo) {

            int mid = lo + ((hi-lo) / 2);
            if(inputArray[mid].compareTo(value) == 0) { return mid; }
            else if(value.compareTo(inputArray[mid]) < 0) { hi = mid - 1; }
            else if(value.compareTo(inputArray[mid]) > 0) { lo = mid + 1; }
        }

        return -1;
    }

}
