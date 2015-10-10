package com.jorgefigueiredo.lib.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class StringUtils {

	public static boolean isAnagram(String a, String b) {
		
		if(a == null || b == null) {
			return false;
		}
		
		if(a.length() == 0 || b.length() == 2) {
			return true;
		}
		
		int[] characters_counter = new int[255];
		
		for(int i = 0; i < a.length(); i++) {
			characters_counter[a.charAt(i)]++;
		}
		
		for(int i = 0; i < b.length(); i++) {
			characters_counter[b.charAt(i)]--;
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
	
	public static boolean areTheTwoStringsAnagramsOfEachOther(String a, String b) {
		
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
	
	public static boolean isIsomorphic(String a, String b) {
		
		
		// TODO - Improve
		
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i = 0; i < a.length(); i++) {
			
			char ca = a.charAt(i);
			char cb = b.charAt(i);
			
			if(map.containsKey(ca)) {
				if(map.get(ca) != cb) {
					return false;
				}
			}
			else if(map.containsValue(cb)) {
				boolean isValuePresent = false;
				for(Entry<Character, Character> entry : map.entrySet()) {
					if(entry.getValue() == cb && entry.getKey() == ca) {
						isValuePresent = true;
						break;
					}
				}
				if(!isValuePresent) {
					return false;
				}
			}
			else {
				map.put(ca, cb);
			}
		}
		
		return true;
	}
	
}
