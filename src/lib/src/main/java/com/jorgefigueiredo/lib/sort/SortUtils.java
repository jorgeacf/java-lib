package com.jorgefigueiredo.lib.sort;

public class SortUtils {

	
	public static <T> void swap(T[] array, int indexA, int indexB) {
		
		T temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
		
	}
	
}
