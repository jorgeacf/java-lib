package com.jf.algorithms.arrays;

import com.jf.structures.tuple.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class PairsSum {

    private final static int MAX = 100000;

    public static List<Pair<Integer, Integer>> findAllPairs(int[] input, int sum) {

        List<Pair<Integer, Integer>> result = new LinkedList<Pair<Integer, Integer>>();

        boolean[] map = new boolean[MAX];

        for (int i = 0; i < input.length; i++) {

            int temp = sum - input[i];

            if (temp >= 0 && map[i]) {
                result.add(new Pair<Integer, Integer>(temp, input[i]));
            }

            map[i] = true;
        }

        return result;
    }

    public static Pair<Integer, Integer> findPair(int[] input, int sum) {

        Arrays.sort(input);

        int lo = 0;
        int hi = input.length - 1;

        while (hi > lo) {

            if (input[lo] + input[hi] == sum) {
                return new Pair<Integer, Integer>(input[lo], input[hi]);
            }

            if (input[lo] + input[hi] > sum) {
                hi--;
            } else {
                lo++;
            }
        }

        return null;
    }
}
