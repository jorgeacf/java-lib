package com.jorgefigueiredo.lib.search;

public final class BinarySearch {

	
	public static <T extends Comparable<T>> int search(T[] input, T element) {
		
		if(input == null) { throw new RuntimeException("Input can't be null."); }
		
		if(input.length == 0) { return -1; }
		
		if(input.length == 1) { return input[0] == element ? 0 : -1; }
		
		int start = 0;
		int end = input.length - 1;
		int mid = 0;
		
		while(start <= end) {
			
			mid = start + ((end - start) / 2);
			if(input[mid] == element) { return mid; }
			else if (element.compareTo(input[mid]) > 0 ) { start = mid + 1; }
			else if (element.compareTo(input[mid]) < 0) { end = mid - 1; }
			
		}
		
		return -1;
	}
	
	
}
