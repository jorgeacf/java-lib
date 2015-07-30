package com.jorgefigueiredo.sort.utils;

public class SelectionSort {

	public static void sort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			int index = i;
			for(int j = i + 1; j < array.length; j++ ) {
				
				if(array[j] < array[index]) {
					index = j;
				}
			}
			
			SortUtils.swap(array, i, index);
		}
		
	}
	
}
