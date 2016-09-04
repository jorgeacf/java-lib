package com.jf.algorithms.string;

import com.jf.utils.CheckUtils;

import java.util.Arrays;

public final class RemoveCharacter {

    public static String remove(String inputString, Character character) {
        CheckUtils.isNull(inputString, "inputString");
        CheckUtils.isNull(character, "character");
        char[] input = inputString.toCharArray();
        int len = inputString.length();
        int newLength = 0;
        for(int i = 0; i < len; i++) {
            if(inputString.charAt(i) != character.charValue()) {
                input[newLength] = input[i];
                newLength++;
            }
        }
        return new String(Arrays.copyOfRange(input, 0, newLength));
    }

}
