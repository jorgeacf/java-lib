package com.jf.algorithms.sorting;

import com.jf.utils.ArrayUtils;

public final class CountingSort {

    private CountingSort() { }

    public static Integer[] sort(Integer[] input) {

        int len = input.length;
        int max = ArrayUtils.max(input);

        int[] count = new int[max+1];

        for(int i = 0; i < len; i++) {
            count[input[i]]++;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] = count[i-1] + count[i];
        }

        Integer[] output = new Integer[len];

        int key = max;
        for(int i = len-1; i >= 0; i--) {

            count[key] -= 1;

            output[i] = key;

            if(i > 0) {
                while (count[key] == count[key - 1]) {
                    key -= 1;
                }
            }
        }

        return output;
    }
}
