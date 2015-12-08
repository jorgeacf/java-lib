package com.jf.stuctures.map;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {

	@Test
	public void testLastElementWithoutResize() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int key = 127;
		
		map.put(key, "" + key);
		
		String value = map.get(key);
		
		assertNotNull(value);
		assertEquals("" + key, value);
		
	}
	
	@Test
	public void testOneElementAfterTheInternalSizeLimit() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int key = 128;
		
		map.put(key, "" + key);
		
		String value = map.get(key);
		
		assertNotNull(value);
		assertEquals("" + key, value);
		
	}
	
	
	@Test
	public void testFullInternalArray() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 0; i < 10; i++) {
			map.put(i, "V" + i);
		}
		
		for(int i = 0; i < 10; i++) {
			String val = map.get(i);
			assertEquals("V"+i,	val);
		}
		
	}
	
	@Test
	public void testRemove() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int key = 127;
		
		map.put(key, "" + key);
		
		String value = "";
		
		value = map.get(key);
		assertNotNull(value);
		assertEquals("" + key, value);
		
		map.remove(key);
		
		value = map.get(key);
		assertNull(value);
		
	}

}
