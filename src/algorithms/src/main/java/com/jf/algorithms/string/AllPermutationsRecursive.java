package com.jf.algorithms.string;

import com.jf.algorithms.utils.CheckUtils;

import java.util.LinkedList;
import java.util.List;

public class AllPermutationsRecursive {

    public static List<String> getPermutations(String inputString) {

        CheckUtils.isNull(inputString, "inputString");

        List<String> result = new LinkedList<String>();

        getPermutations(result, inputString.toCharArray(), 0, inputString.length() - 1);

        return result;
    }

    private static void getPermutations(List<String> output, char[] input, int l, int r) {

        if(r == l) {
            output.add(new String(input));
        }
        else {

            for(int i = l; i <= r; i++) {
                swap(input, l, i);
                getPermutations(output, input, l + 1, r);
                swap(input, l, i);
            }

        }

    }

    private static void swap(char[] input, int i, int j) {

        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }

}
