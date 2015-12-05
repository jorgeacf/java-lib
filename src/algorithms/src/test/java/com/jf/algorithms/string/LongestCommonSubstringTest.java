package com.jf.algorithms.string;

import junit.framework.TestCase;

public class LongestCommonSubstringTest extends TestCase {


    public void testSimpleString() {

        String a = "Hello my name is Jorge. Please to meet you!";
        String b = "Please! Help me with this problem.";

        LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring(a, b);

        assertEquals("Please", longestCommonSubstring.getLCS());

    }

}
