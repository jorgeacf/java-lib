package com.jorgefigueiredo.lib.sort;

public class SelectionSort {

	public static <T extends Comparable<T>> void sort(T[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			
			int index = i;
			for(int j = i + 1; j < array.length; j++ ) {
				
				if(array[j].compareTo(array[index]) < 0) {
					index = j;
				}
			}
			
			SortUtils.swap(array, i, index);
		}
		
	}
	
}
