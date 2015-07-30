package com.jorgefigueiredo.lib.string.utils.tests;

import org.junit.Test;

import com.jorgefigueiredo.lib.string.utils.StringLib;

import junit.framework.Assert;

public class StringUtilsTests {

	@Test(expected=NullPointerException.class)
	public void testNullInputString() {
		
		String input = null;
		
		StringLib.getDuplicateCharacters(input);
		
	}
	
	@Test
	public void testEmptyInputString() {
		
		String input = "";
		
		Character[] result = StringLib.getDuplicateCharacters(input);
		
		Assert.assertNotNull(result);
		Assert.assertEquals(0, result.length);
	}

	@Test
	public void test_Java_InputString() {
		
		String input = "Java";
		
		Character[] result = StringLib.getDuplicateCharacters(input);
		
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.length);
		Assert.assertEquals('a', (char)result[0]);
	}
	
	@Test
	public void test_Programming_InputString() {
		
		String input = "Programming";
		
		Character[] result = StringLib.getDuplicateCharacters(input);
		
		Assert.assertNotNull(result);
		Assert.assertEquals(3, result.length);
		Assert.assertEquals('r', (char)result[0]);
		Assert.assertEquals('m', (char)result[1]);
		Assert.assertEquals('g', (char)result[2]);
	}
	
	@Test
	public void test_abcdef_fedcba_areTheTwoStringsAnagramsOfEachOther() {
	
		String inputA = "abcdef";
		String inputB = "fedcba";
		
		boolean result = StringLib.areTheTwoStringsAnagramsOfEachOther(inputA, inputB);
		
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void test_abcdef_fedcbaX_areTheTwoStringsAnagramsOfEachOther() {
	
		String inputA = "abcdef";
		String inputB = "fedcbaX";
		
		boolean result = StringLib.areTheTwoStringsAnagramsOfEachOther(inputA, inputB);
		
		Assert.assertFalse(result);
		
	}
	
}
