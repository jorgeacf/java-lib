package com.jf.algorithms.string;

import junit.framework.TestCase;

public class LongestRepeatedSubstringTest extends TestCase {

    public void testGetLongestCommonSubstring() {

        String input = "banana";
        LongestRepeatedSubstring longestRepeatedSubstring = new LongestRepeatedSubstring(input);

        assertEquals("ana", longestRepeatedSubstring.get());
    }

    public void testGetLongestCommonSubstring2() {

        String input = "thatisthebestoptionthatwhowillfindout";
        LongestRepeatedSubstring longestRepeatedSubstring = new LongestRepeatedSubstring(input);

        assertEquals("that", longestRepeatedSubstring.get());
    }

    public void testGetLongestCommonSubstring3() {

        String input = "that is the best option that who will find out";
        LongestRepeatedSubstring longestRepeatedSubstring = new LongestRepeatedSubstring(input);

        assertEquals("that ", longestRepeatedSubstring.get());
    }

}
