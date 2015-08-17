package com.jorgefigueiredo.lib.string.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jorgefigueiredo.lib.string.StringUtils;


public class StringUtilsTests {

	@Test(expected=NullPointerException.class)
	public void testNullInputString() {
		
		String input = null;
		
		StringUtils.getDuplicateCharacters(input);
		
	}
	
	@Test
	public void testEmptyInputString() {
		
		String input = "";
		
		Character[] result = StringUtils.getDuplicateCharacters(input);
		
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	@Test
	public void test_Java_InputString() {
		
		String input = "Java";
		
		Character[] result = StringUtils.getDuplicateCharacters(input);
		
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals('a', (char)result[0]);
	}
	
	@Test
	public void test_Programming_InputString() {
		
		String input = "Programming";
		
		Character[] result = StringUtils.getDuplicateCharacters(input);
		
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals('r', (char)result[0]);
		assertEquals('m', (char)result[1]);
		assertEquals('g', (char)result[2]);
	}
	
	@Test
	public void test_abcdef_fedcba_areTheTwoStringsAnagramsOfEachOther() {
	
		String inputA = "abcdef";
		String inputB = "fedcba";
		
		boolean result = StringUtils.areTheTwoStringsAnagramsOfEachOther(inputA, inputB);
		
		assertTrue(result);
		
	}
	
	@Test
	public void test_abcdef_fedcbaX_areTheTwoStringsAnagramsOfEachOther() {
	
		String inputA = "abcdef";
		String inputB = "fedcbaX";
		
		boolean result = StringUtils.areTheTwoStringsAnagramsOfEachOther(inputA, inputB);
		
		assertFalse(result);
		
	}
	
	@Test
	public void test_is_anagram() {
		
		String a = "abbcccddddeeeffg";
		String b = new StringBuilder(a).reverse().toString();
		
		boolean result = StringUtils.isAnagram(a, b);
		
		assertTrue(result);
	}
	
}
