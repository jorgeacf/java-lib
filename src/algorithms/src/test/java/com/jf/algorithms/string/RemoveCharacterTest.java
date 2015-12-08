package com.jf.algorithms.string;

import junit.framework.TestCase;

public class RemoveCharacterTest extends TestCase {


    public void testStringRemoveSpaces() {

        String input = "Jorge André Condeço Figueiredo";

        String output = RemoveCharacter.remove(input, ' ');

        assertEquals("JorgeAndréCondeçoFigueiredo", output);

    }

}
