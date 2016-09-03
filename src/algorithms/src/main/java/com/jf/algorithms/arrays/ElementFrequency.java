package com.jf.algorithms.arrays;

import java.util.HashMap;

public final class ElementFrequency {

    public static <T> HashMap<T, Integer> count(T[] input) {
        return count_implementation_2(input);
    }

    private static <T> HashMap<T, Integer> count_implementation_1(T[] input) {
        HashMap<T, Integer> map = new HashMap<T, Integer>();
        for(T element : input) {
            if(map.containsKey(element)) {
                map.put(element, map.get(element)+1);
            }
            else {
                map.put(element, 1);
            }
        }
        return map;
    }

    /*
     * This implementation uses a modified binary search to have a cost of O(log n)
     */
    private static <T> HashMap<T, Integer> count_implementation_2(T[] input) {
        HashMap<T, Integer> map = new HashMap<T, Integer>();
        count_implementation_2(input, map, 0, input.length-1);
        return map;
    }

    private static <T> void count_implementation_2(T[] input, HashMap<T, Integer> map, Integer low, Integer high) {

        if (input[low] == input[high]) {
            int count = (high-low) + 1;
            T element = input[low];
            if(map.containsKey(element)) {
                map.put(element, map.get(element) + count);
            }
            else {
                map.put(element, count);
            }
        }
        else {
            int mid = low + ((high-low) / 2);
            count_implementation_2(input, map, low, mid);
            count_implementation_2(input, map, mid+1, high);
        }
    }

}
