package com.jf.algorithms.arrays;

import com.jf.utils.CheckUtils;

public final class FindPeakElement {

    private FindPeakElement() { }

    public static <T> Comparable<T> find(Comparable<T>[] inputArray) {

        CheckUtils.isNull(inputArray, "inputArray");
        int len = inputArray.length;
        int peak = -1;
        for(int i = 1; i < len - 1; i++) {
            if(inputArray[i - 1].compareTo((T)inputArray[i]) < 0 && inputArray[i + 1].compareTo((T)inputArray[i]) < 0) {
                peak = Math.max(peak, i);
            }
        }
        if(peak == -1 && inputArray[1].compareTo((T)inputArray[0]) < 0) { peak = 0; }
        if(peak == -1 && inputArray[len-2].compareTo((T)inputArray[len-1]) < 0) { peak = len - 1; }
        return peak >= 0 ? inputArray[peak] : null;
    }

}
