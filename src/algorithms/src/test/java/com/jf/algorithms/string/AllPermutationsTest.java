package com.jf.algorithms.string;

import junit.framework.TestCase;

import java.util.List;

public class AllPermutationsTest extends TestCase {


    public void testAllPermutationsRecursive() {

        String input = "ABC";

        List<String> result = AllPermutationsRecursive.getPermutations(input);

        assertEquals(6, result.size());
        assertEquals("ABC", result.get(0));
        assertEquals("ACB", result.get(1));
        assertEquals("BAC", result.get(2));
        assertEquals("BCA", result.get(3));
        assertEquals("CBA", result.get(4));
        assertEquals("CAB", result.get(5));

    }

    public void testAllPermutationsIterative() {

        String input = "ABC";

        List<String> result = AllPermutationsIterative.getPermutations(input);

        assertEquals(6, result.size());
        assertTrue(result.contains("ABC"));
        assertTrue(result.contains("ACB"));
        assertTrue(result.contains("BAC"));
        assertTrue(result.contains("BCA"));
        assertTrue(result.contains("CBA"));
        assertTrue(result.contains("CAB"));

    }

}
