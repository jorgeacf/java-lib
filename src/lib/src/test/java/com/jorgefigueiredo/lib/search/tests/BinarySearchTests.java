package com.jorgefigueiredo.lib.search.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jorgefigueiredo.lib.search.BinarySearch;

public class BinarySearchTests {

	@Test(expected=RuntimeException.class)
	public void testNull() {
		
		Integer[] input = null;
		
		BinarySearch.search(input, 0);
	
	}
	
	@Test
	public void testOneItem() {
		
		Integer[] input = new Integer[] { 0 };
		
		int exist = BinarySearch.search(input, 0);
		
		int dontExist = BinarySearch.search(input, 1);
		
		assertEquals(0, exist);
		assertEquals(-1, dontExist);
	}
	
	@Test
	public void testTwoItems() {
		
		Integer[] input = new Integer[] { 0, 1 };
		
		int first = BinarySearch.search(input, 0);
		
		int second = BinarySearch.search(input, 1);
		
		int dontExist = BinarySearch.search(input, 2);
		
		assertEquals(0, first);
		assertEquals(1, second);
		assertEquals(-1, dontExist);
	}
	
	@Test
	public void test() {
		
		Integer[] input = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int first = BinarySearch.search(input, 0);
		
		int middle = BinarySearch.search(input, 4);
		
		int last = BinarySearch.search(input, 9);
		
		assertEquals(0, first);
		assertEquals(4, middle);
		assertEquals(9, last);
	}

}
