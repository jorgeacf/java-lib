package com.jf.algorithms.arrays;

public final class FindMedian {

    public static int find(int[] input) {
        int mid = input.length / 2;
        int even = input.length % 2;
        if(even == 0)   { return input[mid]; }
        else            { return (input[mid] + input[mid+1]) / 2; }
    }
}
