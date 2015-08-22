package com.jorgefigueiredo.lib.select.tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.jorgefigueiredo.lib.select.TopN;

public class TopNTests {

	@Test
	public void test() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("jorge", 10);
		map.put("andre", 5);
		map.put("condeco", 15);
		map.put("figueiredo", 30);
		
		LinkedHashMap<String, Integer> sortedMap = TopN.getTopNByValue(map, 10);
		
		Iterator<Entry<String, Integer>> iterator = sortedMap.entrySet().iterator();
		
		Entry<String, Integer> e1 = iterator.next();
		Entry<String, Integer> e2 = iterator.next();
		Entry<String, Integer> e3 = iterator.next();
		Entry<String, Integer> e4 = iterator.next();
		
		assertEquals(new Integer(30), e1.getValue());
		assertEquals("figueiredo", e1.getKey());
		
		assertEquals(new Integer(15), e2.getValue());
		assertEquals("condeco", e2.getKey());
		
		assertEquals(new Integer(10), e3.getValue());
		assertEquals("jorge", e3.getKey());
		
		assertEquals(new Integer(5), e4.getValue());
		assertEquals("andre", e4.getKey());
	}

}
