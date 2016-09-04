package com.jf.algorithms.string;

import junit.framework.TestCase;

public class ReverseWordsTest extends TestCase {

    public void testReverseWords() {
        String input = "aaa.bbb.ccc.ddd.eee";
        String result = ReverseWords.reverse(input, '.');
        assertEquals("eee.ddd.ccc.bbb.aaa", result);
    }

}
