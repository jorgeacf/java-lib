package com.jorgefigueiredo.lib.arrays.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.jorgefigueiredo.lib.array.ArrayUtils;

public class ArrayUtilsTests {

	@Test
	public void test() {
		
		int k = 3;
		Integer[] a = new Integer[] { 1,2,3,4,5,6,7 };
		Integer[] r = new Integer[] { 5,6,7,1,2,3,4 };
		
		ArrayUtils.rotate(a, k);
		
		assertTrue(Arrays.equals(a, r));
		
	}

}
