package com.jf.utils;

public final class ArrayUtils {

    public static void exchange(Comparable[] inputArray, int i, int j) {
        CheckUtils.isNull(inputArray, "inputArray");
        if(i < 0 && i > inputArray.length || j < 0 && j > inputArray.length) { throw new IllegalArgumentException("The indexes i or j should be in the range of the array."); }
        Comparable temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

    public static void reverse(Object[] inputArray) {
        CheckUtils.isNull(inputArray, "inputArray");

        int i = 0;
        int mid = inputArray.length / 2;
        while(i < mid) {
            Object temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = temp;
            i++;
        }
    }

    public static String printValues(Object[] inputArray) {

        if(inputArray == null) { return "[null]"; }
        StringBuilder sb = new StringBuilder();
        for(Object o : inputArray) {
            if(sb.length() > 0) { sb.append(", "); }
            sb.append(o.toString());
        }
        sb.insert(0, "[");
        sb.insert(sb.length(), "]");
        return sb.toString();
    }

    public static <T extends Comparable<T>> T max(T[] input) {

        CheckUtils.isNull(input, "input");
        if(input.length == 0) { return null; }
        T max = input[0];
        int len = input.length;
        for(int i = 1; i < len; i++) {
            if(input[i].compareTo(max) > 0) { max = input[i]; }
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(T[] input) {

        CheckUtils.isNull(input, "input");
        if(input.length == 0) { return null; }
        T min = input[0];
        int len = input.length;
        for(int i = 1; i < len; i++) {
            if(input[i].compareTo(min) < 0) { min = input[i]; }
        }
        return min;
    }
}
