package com.jf.algorithms.arrays;

import com.jf.utils.ArrayUtils;

public final class ReorderArrayByIndexArray {

    public static void sort(Integer[] inputArray, Integer[] indexArray) {

        if(inputArray == null) { throw new NullPointerException("The inputArray can't be null."); }
        if(indexArray == null) { throw new NullPointerException("The indexArray can't be null."); }
        if(inputArray.length != indexArray.length) { throw new IllegalArgumentException("The arrays inputArray and indexArray must have the same length."); }

        int len = inputArray.length;

        /*
        for(int i = 0; i < len; i++) {

            for(int j = len-1; j > i; j--) {

                if(indexArray[j].compareTo(indexArray[i]) < 0) {
                    ArrayUtils.exchange(inputArray, i, j);
                    ArrayUtils.exchange(indexArray, i, j);
                }
            }
        }
        */
        for(int i = 0; i < len; i++) {

            ArrayUtils.exchange(inputArray, indexArray[i], i);
            ArrayUtils.exchange(indexArray, indexArray[i], i);

        }

    }



}
