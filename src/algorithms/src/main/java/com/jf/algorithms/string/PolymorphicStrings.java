package com.jf.algorithms.string;

import com.jf.utils.CheckUtils;

public final class PolymorphicStrings {

    private PolymorphicStrings() { }

    public static boolean isPolymorphic(String a, String b) {

        CheckUtils.isNull(a, "a");
        CheckUtils.isNull(b, "b");
        if(a.length() != b.length()) { return false; }

        int len = a.length();

        char[] map = new char['z'-'a'];

        for(int i = 0; i < len; i++) {

            int index = a.charAt(i) - 'a';

            if      (map[index] == 0) { map[index] = b.charAt(i); }
            else if (map[index] != b.charAt(i)) { return false; }
        }

        return true;
    }

}
