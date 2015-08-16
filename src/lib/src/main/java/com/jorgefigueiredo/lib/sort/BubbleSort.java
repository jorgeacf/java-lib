package com.jorgefigueiredo.lib.sort;

public class BubbleSort {

	public static <T extends Comparable<T>> void sort(T[] array) {
		
		for(int i = array.length - 1; i >= 0; i--) {
			
			for(int j = 1; j <= i; j++) {
				
				if(array[j-1].compareTo(array[j]) > 0) {
					
					SortUtils.swap(array, j, j-1);
					
				}
				
			}
			
		}
		
	}
	
}
