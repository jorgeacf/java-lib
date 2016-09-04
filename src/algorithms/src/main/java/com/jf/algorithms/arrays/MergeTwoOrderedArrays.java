package com.jf.algorithms.arrays;

import java.util.Comparator;

public final class MergeTwoOrderedArrays {

    public static int[] merge(int[] inputA, int[] inputB) {
        int[] result = new int[inputA.length + inputB.length];
        int current=0;
        int i=0;
        int j=0;
        while(i<inputA.length && j<inputB.length) {
            if(inputA[i] < inputB[j]) {
                result[current] = inputB[j];
                j++;
                current++;
            }
            else {
                result[current] = inputA[i];
                i++;
                current++;
            }
        }
        return result;
    }

}
