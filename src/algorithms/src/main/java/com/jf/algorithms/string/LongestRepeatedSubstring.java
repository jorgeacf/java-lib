package com.jf.algorithms.string;

import com.jf.structures.string.SuffixArray;

public class LongestRepeatedSubstring {

    private final SuffixArray suffixArray;

    public LongestRepeatedSubstring(String inputString) {
        suffixArray = new SuffixArray(inputString);
    }

    public String get() {

        int len;
        String lrc = "";

        for(int i = 1; i < suffixArray.length(); i++) {

            len = suffixArray.lcp(i);

            if(len > lrc.length()) {
                lrc = suffixArray.get(i).getSuffix().substring(0, len);
            }
        }

        return lrc;
    }

}
