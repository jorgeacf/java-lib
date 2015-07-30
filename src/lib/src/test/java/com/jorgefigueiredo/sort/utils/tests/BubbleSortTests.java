package com.jorgefigueiredo.sort.utils.tests;

import org.junit.Test;

import com.jorgefigueiredo.sort.utils.BubbleSort;

import junit.framework.Assert;

public class BubbleSortTests {

	@Test
	public void testSort() {
		
		int[] array = new int[] { 4, 2, 5, 1, 7, 8, 3 };
		
		BubbleSort.sort(array);
		
		Assert.assertEquals(1, array[0]);
		Assert.assertEquals(2, array[1]);
		Assert.assertEquals(3, array[2]);
		Assert.assertEquals(4, array[3]);
		Assert.assertEquals(5, array[4]);
		Assert.assertEquals(7, array[5]);
		Assert.assertEquals(8, array[6]);
		
	}

}
