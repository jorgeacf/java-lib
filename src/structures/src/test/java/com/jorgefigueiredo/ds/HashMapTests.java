package com.jorgefigueiredo.ds;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jorgefigueiredo.ds.HashMap;
import com.jorgefigueiredo.ds.IMap;

public class HashMapTests {

	@Test
	public void testLastElementWithoutResize() {
		
		IMap<Integer, String> map = new HashMap<Integer, String>();
		
		int key = 127;
		
		map.put(key, "" + key);
		
		String value = map.get(key);
		
		assertNotNull(value);
		assertEquals("" + key, value);
		
	}
	
	@Test
	public void testOneElementAfterTheInternalSizeLimit() {
		
		IMap<Integer, String> map = new HashMap<Integer, String>();
		
		int key = 128;
		
		map.put(key, "" + key);
		
		String value = map.get(key);
		
		assertNotNull(value);
		assertEquals("" + key, value);
		
	}
	
	
	@Test
	public void testFullInternalArray() {
		
		IMap<Integer, String> map = new HashMap<Integer, String>();
		
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
		
		IMap<Integer, String> map = new HashMap<Integer, String>();
		
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
