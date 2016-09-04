package com.jf.algorithms.string;

import junit.framework.TestCase;

public class RemoveCharacterDuplicatedTest extends TestCase {

    public void testRemoveDuplicatedCharacters() {
        String input = "abcbdabefdgcabheciafffdgjb";
        String result = new String(RemoveCharacterDuplicated.remove(input.toCharArray()));
        assertEquals("abcdefghij", result);
    }

}
