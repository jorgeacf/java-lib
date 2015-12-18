package com.jf.algorithms.sorting;

import com.jf.utils.ArrayUtils;
import com.jf.utils.CheckUtils;

public final class BubbleSort {

    private BubbleSort() { }

    public static void sort(Comparable[] inputArray) {

        CheckUtils.isNull(inputArray, "inputArray");

        int len = inputArray.length;

        for(int i = len-1; i >= 0; i--) {

            int max = 0;
            for(int j = 1; j < i; j++) {

                if(inputArray[j].compareTo(inputArray[max]) > 0) {
                    max = j;
                }
            }
            ArrayUtils.exchange(inputArray, max, i);
        }

    }

}
