package com.jorgefigueiredo.lib.array;




public class ArrayUtils {

	
	public static <T> void rotate(T[] array, int order) {
		
		
		for(int i = 0; i < order; i++) {
			
			for(int j = array.length-1; j > 0; j--) {
				
				T temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				
			}
			
		}
		
	}
	
}
