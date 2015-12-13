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
            inputArray[i] = inputArray[inputArray.length - i];
            inputArray[inputArray.length - i] = temp;
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

}
