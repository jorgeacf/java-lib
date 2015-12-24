package com.jf.structures.string;

import junit.framework.TestCase;

import java.util.Arrays;

public class SuffixArrayTest extends TestCase {

    public void testValidArray() {

        String input = "banana";

        SuffixArray suffixArray = new SuffixArray(input);

        String[] output = suffixArray.print().split("\n");

        assertEquals("a", output[0]);
        assertEquals("ana", output[1]);
        assertEquals("anana", output[2]);
        assertEquals("banana", output[3]);
        assertEquals("na", output[4]);
        assertEquals("nana", output[5]);

    }

    public void testLCPValues() {

        String input = "banana";

        SuffixArray suffixArray = new SuffixArray(input);

        assertEquals(1, suffixArray.lcp(1));
        assertEquals(3, suffixArray.lcp(2));
        assertEquals(0, suffixArray.lcp(3));
        assertEquals(0, suffixArray.lcp(4));
        assertEquals(2, suffixArray.lcp(5));
    }

    public void testLCPArray() {

        String input = "banana";

        SuffixArray suffixArray = new SuffixArray(input);

        assertTrue(Arrays.equals(new int[]{-1, 1, 3, 0, 0, 2}, suffixArray.getLCPArray()));

    }

    public void testValidArrayWith$() {

        String input = "banana$";

        SuffixArray suffixArray = new SuffixArray(input);

        String[] output = suffixArray.print().split("\n");

        assertEquals("$", output[0]);
        assertEquals("a$", output[1]);
        assertEquals("ana$", output[2]);
        assertEquals("anana$", output[3]);
        assertEquals("banana$", output[4]);
        assertEquals("na$", output[5]);
        assertEquals("nana$", output[6]);

    }

    public void testLCPValuesWith$() {

        String input = "banana$";

        SuffixArray suffixArray = new SuffixArray(input);

        String[] output = suffixArray.print().split("\n");

        assertEquals(0, suffixArray.lcp(1));
        assertEquals(1, suffixArray.lcp(2));
        assertEquals(3, suffixArray.lcp(3));
        assertEquals(0, suffixArray.lcp(4));
        assertEquals(0, suffixArray.lcp(5));
        assertEquals(2, suffixArray.lcp(6));
    }

    public void testLCPArrayWith$() {

        String input = "banana$";

        SuffixArray suffixArray = new SuffixArray(input);

        assertTrue(Arrays.equals(new int[] {-1, 0, 1, 3, 0, 0, 2}, suffixArray.getLCPArray()));

    }

}
