package com.jf.structures.string;

import java.util.Arrays;

public class SuffixArray {

    private final Suffix[] suffixes;

    public SuffixArray(String inputString) {

        suffixes = new Suffix[inputString.length()];

        for(int i = 0; i < inputString.length(); i++) {
            suffixes[i] = new Suffix(inputString, i);
        }
        Arrays.sort(suffixes);

    }

    public int lcp(int i) {

        if(i < 1 || i > suffixes.length) { throw new IllegalArgumentException(String.format("The parameter i should be between %d and %d.", 1, suffixes.length)); }

        return lcp(suffixes[i], suffixes[i-1]);
    }

    private int lcp(Suffix a, Suffix b) {

        int N = Math.min(a.length(), b.length());

        for(int i = 0; i < N; i++) {
            if(a.charAt(i) != b.charAt(i)) { return i; }
        }
        return N;
    }

    public int[] getLCPArray() {

        int[] lcpArray = new int[suffixes.length];

        lcpArray[0] = -1;
        for(int i = 1; i < lcpArray.length; i++) {
            lcpArray[i] = lcp(i);
        }

        return lcpArray;
    }

    public Suffix get(int index) {
        return suffixes[index];
    }

    public int index(int index) { return suffixes[index].index; }

    public int length() {
        return suffixes.length;
    }

    public String print() {

        StringBuffer sb = new StringBuffer();

        for(Suffix suffix : suffixes) {
            sb.append(suffix + "\n");
        }

        return sb.toString();
    }


    public static class Suffix implements Comparable<Suffix> {

        private final String text;
        private final int index;

        public Suffix(String text, int index) {
            this.text = text;
            this.index = index;
        }

        public String getSuffix() { return text.substring(index); }

        public int length() {
            return text.length() - index;
        }

        public char charAt(int i) {
            return text.charAt(index + i);
        }

        public int compareTo(Suffix that) {

            int min = Math.min(this.length(), that.length());

            for(int i = 0; i < min; i++) {
                if(this.charAt(i) < that.charAt(i)) { return -1; }
                else if(this.charAt(i) > that.charAt(i)) { return +1; }
            }

            return this.length() - that.length();
        }

        @Override
        public String toString() {
            return text.substring(index); //String.format("%d-%s", index, text);
        }
    }



}
