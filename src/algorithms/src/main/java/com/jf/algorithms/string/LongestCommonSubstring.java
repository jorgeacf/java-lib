package com.jf.algorithms.string;

import com.jf.stuctures.SuffixArray;

public class LongestCommonSubstring {

    String a;
    String b;
    SuffixArray suffixArrayA;
    SuffixArray suffixArrayB;

    public LongestCommonSubstring(String a, String b) {

        this.suffixArrayA = new SuffixArray(a);
        this.suffixArrayB = new SuffixArray(b);

        this.a = a;
        this.b = b;

    }

    private static String lcp(String s, int p, String t, int q) {

        int n = Math.min(s.length() - p, t.length() - q);

        for(int i = 0; i < n; i++) {
            if(s.charAt(p + i) != t.charAt(q + i)) {
                return s.substring(p, p+i);
            }
        }

        return s.substring(p, p + n);
    }

    private static int compare(String s, int p, String t, int q) {

        int n = Math.min(s.length() - p, t.length() - q);

        for(int i = 0; i < n; i++) {
            if(s.charAt(p + i) != t.charAt(q + i)) {
                return s.charAt(p + i) - t.charAt(q + i);
            }
        }

        if      (s.length() - p < t.length() - q)   { return -1; }
        else if (s.length() - p > t.length() - q)   { return 1; }
        else                                        { return 0; }
    }

    public String getLCS() {

        String lcs = "";
        int i = 0;
        int j = 0;
        while(i < suffixArrayA.length() && j < suffixArrayB.length()) {

            int p = suffixArrayA.index(i);
            int q = suffixArrayB.index(j);

            String x = lcp(a, p, b, q);

            if(x.length() > lcs.length()) { lcs = x; }

            if(compare(a, p, b, q) < 0) { i++; }
            else                        { j++; }

        }

        return lcs;
    }

}
