package com.jf.algorithms;

public class ArrayUtils {

    public static void exchange(Comparable[] input, int i, int j) {

        if(input == null) { throw new IllegalArgumentException("Input array can't be null."); }

        if(i < 0 && i > input.length || j < 0 && j > input.length) { throw new IllegalArgumentException("The indexes i or j should be in the range of the array."); }

        Comparable temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }

}
