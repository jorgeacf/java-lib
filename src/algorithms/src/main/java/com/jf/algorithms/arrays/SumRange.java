package com.jf.algorithms.arrays;

public final class SumRange {

    public static Integer get(Integer[] inputArray, int lo, int hi) {

        Integer[] preSum = getArrayPreSum(inputArray);

        return preSum[hi + 1] - preSum[lo];
    }

    private static Integer[] getArrayPreSum(Integer[] inputArray) {

        Integer[] preSum = new Integer[inputArray.length];
        preSum[0] = 0;

        for(int i = 1; i < inputArray.length; i++) {
            preSum[i] = preSum[i - 1] + inputArray[i - 1];
        }

        return preSum;
    }

}
