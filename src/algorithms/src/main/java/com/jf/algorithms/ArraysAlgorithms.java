package com.jf.algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class ArraysAlgorithms {

    public static final class Rotate_V1 {

        public static void rotate(Integer[] input, int k) {

            if(k > input.length) {
                k = k % input.length;
            }

            Integer[] result = new Integer[input.length];
            for(int i = 0; i < input.length - k; i++) {
                result[i] = input[i + k];
            }

            for(int i = 0; i < k; i++) {
                result[input.length-k+i] = input[i];
            }

            System.arraycopy(result, 0, input, 0, input.length);
        }

    }

    public static final class LargestKthElement {

        public static int kthElement(Integer[] input, int k) {
            Arrays.sort(input);
            return input[input.length - k];
        }

    }

    public static final class ReorderByIndexArray {

        public static void reorder(Integer[] arr, Integer[] index) {

            for(int i = 0; i < arr.length; i++) {
                swap(arr, index[i], i);
                swap(index, index[i], i);
            }

        }

        private static void swap(Integer[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

    }

    public static final class CountFrequencies {
        /*
                        0, 1, 2, 3, 4
        Input: arr[] = {2, 3, 3, 2, 5}
        Output: Below are frequencies of all elements
        1 -> 0
                2 -> 2
                3 -> 2
                4 -> 0
                5 -> 1

         0, 1, 2, 3, 4
        {2, 3, 3, 2, 5}
        {3, 3, -1, 2, 5}
        {2, 3, -1, -1, 5}
        {2, 3, -2, -1, 5}
        {2, 3, -2, -2, 5}
        {2, 3, -2, -2, -1}

        */
        public static void count(Integer[] array) {

            for(int i = 0; i < array.length; i++) {

                if(array[i] < 0) { continue; }

                int index = array[i] - 1;
                if(array[ index ] < 0) {
                    array[ index ]--;
                    array[i] = 0;
                }
                else {
                    array[i] = array[ index ];
                    array[ index ] = -1;
                    i--;
                }

            }

        }

    }

    public static final class FindPeakElement {

        public static Integer get(Integer[] input) {

            if(input.length <= 3) { return null; }

            if(input[1] <= input[0]) { return input[0]; }
            if(input[input.length-2] <= input[input.length-1]) { return input[input.length-1]; }

            for(int i = 1; i < input.length - 1; i++) {

                if(input[i-1] <= input[i] && input[i+1] <= input[i]) {
                    return input[i];
                }

            }

            return null;
        }

    }

    public static final class FindMedian {

        public static int find(int[] input) {

            Arrays.sort(input);

            int mid = input.length / 2;
            int even = input.length % 2;

            if(even == 0) {
                return input[mid];
            }
            else {
                return (input[mid] + input[mid+1]) / 2;
            }

        }

        public static int find(int[] input1, int[] input2) {

            return -1;
        }

    }

    public static final class FindPairsSum {

        private static final int MAX = 100000;
        public static List<String> find1(int[] input, int sum) {

            List<String> result = new LinkedList<String>();

            boolean[] map = new boolean[MAX];

            for(int i = 0; i < input.length; i++) {

                int temp = sum - input[i];

                if(temp >= 0 && map[temp]) {
                    result.add(String.format("%d-%d", input[i], temp));
                }
                map[input[i]] = true;
            }

            return result;
        }

        public static List<String> find2(int[] input, int sum) {

            Arrays.sort(input);

            int lo = 0;
            int hi = input.length-1;

            while(hi > lo) {

                if (input[lo] + input[hi] == sum) {
                    List list = new LinkedList<String>();
                    list.add(String.format("%d-%d", input[hi], input[lo]));
                    return list;
                }

                if(input[lo] + input[hi] > sum) {
                    hi--;
                }
                else {
                    lo++;
                }
            }

            return null;
        }

    }

    public static final class TripletsSum {

        public static int countTripletsLessThanSum(int[] input, int sum) {

            int count = 0;
            for(int i = 0; i < input.length; i++) {

                for(int j = i + 1; j < input.length; j++) {

                    for(int k = j + 1; k < input.length; k++) {

                        if(input[i] + input[j] + input[k] < sum) { count++; }

                    }
                }
            }
            return count;
        }

        private static int MAX = 100000;
        public static int countTripletsLessThanSum2(int[] input, int sum) {

            Arrays.sort(input);

            int count = 0;
            for(int i = 0; i < input.length; i++) {

                int lo = i + 1;
                int hi = input.length-1;

                while(lo < hi) {

                    if(input[i] + input[lo] + input[hi] >= sum) {
                        hi--;
                    }
                    else {
                        if(input[i] + input[lo] + input[hi] < sum) { count += hi - lo;  }
                        lo++;
                    }
                }

            }
            return count;
        }

    }


}
