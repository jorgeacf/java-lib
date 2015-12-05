package com.jf.algorithms;

public final class SearchAlgorithms {

    public static final class BinarySearch {

        public static int search(Integer[] input, int value) {

            if(input == null) { throw new IllegalArgumentException(); }

            return search(input, value, 0, input.length);
        }

        private static int search(Integer[] input, Integer value, int lo, int hi) {

            if(lo >= hi) { return -1; }
            int mid = lo + (hi-lo) / 2;

            int cmp = input[mid].compareTo(value);
            if(cmp > 0) { return search(input, value, lo, mid); }
            else if(cmp < 0) { return search(input, value, mid+1, hi); }
            else { return mid; }

        }

    }

}
