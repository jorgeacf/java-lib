package com.jf.algorithms;

import junit.framework.TestCase;

public class StringAlgorithmsTest extends TestCase {

    /*
    public void testReverseString() {

        String input = "jorge figueiredo";
        String result = "oderieugif egroj";

        assertEquals(result, StringAlgorithms.Reverse.reverse_iterative(input));
        assertEquals(result, StringAlgorithms.Reverse.reverse_recursive(input));
    }

    public void testReverseStringNonSpecialCharacters() {

        String input = "a,b$c";
        String result = "c,b$a";

        assertEquals(result, StringAlgorithms.ReverseNonSpecialCharacters.reverse(input));
    }

    public void testReverseStringNonSpecialCharacters2() {

        String input = "Ab,c,de!$";
        String result = "ed,c,bA!$";

        assertEquals(result, StringAlgorithms.ReverseNonSpecialCharacters.reverse(input));
    }

    public void testRemoveCharacter() {

        String input = "j o  r g    e f  i g     u e  i  r   e d   o";
        String result = "jorgefigueiredo";

        assertEquals(result, StringAlgorithms.RemoveCharacter.remove(input.toCharArray(), ' '));

    }
    */

    public void testCountValidParenthesis() {

        assertEquals(2, StringAlgorithms.CountValidParenthesis.count("((()"));
        assertEquals(4, StringAlgorithms.CountValidParenthesis.count(")()())"));
        assertEquals(6, StringAlgorithms.CountValidParenthesis.count("()(()))))"));

    }

    public void testBalancedParenthesis() {

        assertTrue(StringAlgorithms.BalancedParenthesis.isBalanced("[()]{}{[()()]()}"));
        assertFalse(StringAlgorithms.BalancedParenthesis.isBalanced("[(])"));
        assertFalse(StringAlgorithms.BalancedParenthesis.isBalanced("([]"));
        assertFalse(StringAlgorithms.BalancedParenthesis.isBalanced("[])"));
    }

    public void testIsPolimorphic() {

        assertTrue(StringAlgorithms.Polimorphic.isPolimorphic("aab", "xxy"));
        assertFalse(StringAlgorithms.Polimorphic.isPolimorphic("aab", "xyz"));
    }

}
