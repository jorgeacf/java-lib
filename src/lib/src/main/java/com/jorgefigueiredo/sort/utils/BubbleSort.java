package com.jorgefigueiredo.sort.utils;

public class BubbleSort {

	public static void sort(int[] array) {
		
		for(int i = array.length - 1; i >= 0; i--) {
			
			for(int j = 1; j <= i; j++) {
				
				if(array[j-1] > array[j]) {
					
					SortUtils.swap(array, j, j-1);
					
				}
				
			}
			
		}
		
	}
	
}
