package com.jorgefigueiredo.sort.utils;

public class InsertionSort {

	public static void sort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			for(int k = i; k > 0 && array[k] < array[k-1]; k--) {
				
				SortUtils.swap(array, k, k-1);
				
			}
			
		}
		
	}
	
}
