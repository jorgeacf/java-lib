package com.jf.algorithms.string;

import com.jf.utils.CheckUtils;

public final class ReverseExceptChars {

    public static String reverse(String inputString, String exceptCharacters) {
        CheckUtils.isNull(inputString, "inputString");
        CheckUtils.isNull(exceptCharacters, "exceptCharacters");
        char[] input = inputString.toCharArray();
        int i = 0;
        int j = input.length - 1;
        while(i < j) {
            while(exceptCharacters.contains(input[i] + "")) { i++; }
            while(exceptCharacters.contains(input[j] + "")) { j--; }
            char c = input[i];
            input[i] = input[j];
            input[j] = c;
            i++;
            j--;
        }
        return new String(input);
    }

}
