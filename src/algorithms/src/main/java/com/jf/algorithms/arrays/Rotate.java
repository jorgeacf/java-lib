package com.jf.algorithms.arrays;

import com.jf.utils.CheckUtils;

public final class Rotate {

    private Rotate() { }

    public static void rotate(Comparable[] inputArray, int k) {

        CheckUtils.isNull(inputArray, "inputArray");

        int len = inputArray.length;

        Comparable[] result = new Comparable[len];

        k = k % inputArray.length;

        if (k < 0) {
            k = len - Math.abs(k);
        }

        for(int i = 0; i < k; i++) {
            result[i] = inputArray[i + len - k];
        }

        for(int i = k; i < len; i++) {
            result[i] = inputArray[i - k];
        }

        System.arraycopy(result, 0, inputArray, 0, len);

    }

}
