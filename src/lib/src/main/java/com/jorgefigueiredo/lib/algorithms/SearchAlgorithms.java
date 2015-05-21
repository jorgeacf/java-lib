package com.jorgefigueiredo.lib.algorithms;



public class SearchAlgorithms {

	
	public int BinarySearch(int[] elements, int element) {
		
		int start = 0;
		int end = elements.length - 1;
		int mid = 0;
		
		while(start <= end) {
			
			mid = start + ((end - start) / 2);
			if(elements[mid] == element) { return mid; }
			else if (element > elements[mid]) { start = mid + 1; }
			else if (element < elements[mid]) { end = mid - 1; }
			
		}
		
		return -1;
	}
	
}
