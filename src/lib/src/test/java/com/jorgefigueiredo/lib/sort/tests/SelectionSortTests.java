package com.jorgefigueiredo.lib.sort.tests;

import org.junit.Test;

import com.jorgefigueiredo.lib.sort.InsertionSort;

import junit.framework.Assert;

public class SelectionSortTests {

	@Test
	public void test() {
		
		Integer[] array = new Integer[] { 4, 2, 5, 1, 7, 8, 3 };
		
		InsertionSort.sort(array);
		
		Assert.assertEquals(new Integer(1), array[0]);
		Assert.assertEquals(new Integer(2), array[1]);
		Assert.assertEquals(new Integer(3), array[2]);
		Assert.assertEquals(new Integer(4), array[3]);
		Assert.assertEquals(new Integer(5), array[4]);
		Assert.assertEquals(new Integer(7), array[5]);
		Assert.assertEquals(new Integer(8), array[6]);
		
	}

}
