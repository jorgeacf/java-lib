package com.jorgefigueiredo.lib.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StringUtils {

	public static boolean isAnagram(String input1, String input2) {
		
		if(input1 == null || input2 == null) {
			return false;
		}
		
		if(input1.length() == 0 || input2.length() == 2) {
			return true;
		}
		
		int[] characters_counter = new int[255];
		
		for(int i = 0; i < input1.length(); i++) {
			characters_counter[input1.charAt(i)]++;
		}
		
		for(int i = 0; i < input2.length(); i++) {
			characters_counter[input2.charAt(i)]--;
		}
		
		for(int i = 0; i < characters_counter.length; i++) {
			if(characters_counter[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static Character[] getDuplicateCharacters(String input) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		List<Character> repeted = new LinkedList<Character>();
		
		for(Character c : input.toCharArray()) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				repeted.add(c);
			}
			else {
				map.put(c, 1);
			}
		}
		
		return repeted.toArray(new Character[0]);
	}
	
	public static Boolean areTheTwoStringsAnagramsOfEachOther(String a, String b) {
		
		if( (a == null || b == null) || a.length() != b.length() ) {
			return false;
		}
		
		int len = a.length();
		
		int[] counter = new int[255];
		
		for(int i = 0; i < len; i++) {
			int index = a.charAt(i) - 'a';
			counter[index]++;
		}
		
		for(int i = 0; i < len; i++) {
			int index = b.charAt(i) - 'a';
			counter[index]--;
			
			if(counter[index] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
