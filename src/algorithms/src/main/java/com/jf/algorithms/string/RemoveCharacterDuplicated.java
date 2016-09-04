package com.jf.algorithms.string;

import java.util.Arrays;

public final class RemoveCharacterDuplicated {

    public static char[] remove(char[] input) {
        boolean[] map = new boolean[256];
        int current = 0;
        for(int i=0;i<input.length;i++) {
            if(!map[input[i]]) {
                input[current] = input[i];
                map[input[i]]=true;
                current++;
            }
        }
        return Arrays.copyOfRange(input, 0, current);
    }

}
