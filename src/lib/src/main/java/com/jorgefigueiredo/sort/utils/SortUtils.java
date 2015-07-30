package com.jorgefigueiredo.sort.utils;

public class SortUtils {

	
	public static void swap(int[] array, int indexA, int indexB) {
		
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
		
	}
	
}
