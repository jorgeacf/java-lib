package com.jorgefigueiredo.lib.algorithms;

import junit.framework.TestCase;


public class SearchAlgorithmTests extends TestCase {

	
	public void testBinarySearch() {
		
		int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		SearchAlgorithms search = new SearchAlgorithms();
		
		int index = search.BinarySearch(data, 3);
		
		assertEquals(2, index);
		
	}
	
	
}
