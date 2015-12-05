package com.jf.algorithms.searching;

public final class IterativeBinarySearch {

    public static int search(Comparable[] inputArray, Comparable value) {

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
