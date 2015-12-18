package com.jf.algorithms.arrays;

import java.util.Arrays;

public final class KthArrayElement {

    public static <T> T find(T[] inputArray, int k) {

        T[] copy = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(copy);
        return copy[copy.length - k];

    }

}
