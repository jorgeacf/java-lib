package com.jorgefigueiredo.lib.sort;

public class InsertionSort {

	public static <T extends Comparable<T>> void sort(T[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			for(int k = i; k > 0 && array[k].compareTo(array[k-1]) < 0; k--) {
				
				SortUtils.swap(array, k, k-1);
				
			}
			
		}
		
	}
	
}
