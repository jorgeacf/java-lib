package com.jf.algorithms.sorting;

public final class ShellSort {

    private ShellSort() {}

    /**
     *
     * @param inputArray
     */
    public static void sort(Comparable[] inputArray) {

        if(inputArray == null) { throw new IllegalArgumentException("The inputArray can't be null."); }

        for( int gap = inputArray.length / 2; gap > 0; gap /= 2 ) {

            for(int i = gap; i < inputArray.length; i++) {

                Comparable temp = inputArray[i];

                int j;
                for(j = i; j >= gap && temp.compareTo(inputArray[j-gap]) < 0; j -= gap) {
                    inputArray[j] = inputArray[j-gap];
                }

                inputArray[j] = temp;
            }
        }

    }

}
