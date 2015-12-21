package com.jf.algorithms.arrays;

import java.util.Arrays;

public final class SumTriplets {


    public static int tripletsWithSumLessThan_n3(int[] inputArray, int sum) {

        int count = 0;
        for(int i = 0; i < inputArray.length; i++) {

            for(int j = i + 1; j < inputArray.length; j++) {

                for(int k = j + 1; k < inputArray.length; k++) {

                    if(inputArray[i] + inputArray[j] + inputArray[k] < sum) { count++; }

                }
            }
        }
        return count;
    }

    public static int tripletsWithSumLessThan_n2(int[] inputArray, int sum) {

        Arrays.sort(inputArray);

        int count = 0;
        for(int i = 0; i < inputArray.length; i++) {

            int lo = i + 1;
            int hi = inputArray.length-1;

            while(lo < hi) {

                if(inputArray[i] + inputArray[lo] + inputArray[hi] >= sum) {
                    hi--;
                }
                else {
                    if(inputArray[i] + inputArray[lo] + inputArray[hi] < sum) { count += hi - lo;  }
                    lo++;
                }
            }

        }
        return count;
    }


}
