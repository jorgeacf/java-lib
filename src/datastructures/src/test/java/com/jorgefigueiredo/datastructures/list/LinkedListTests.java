package com.jorgefigueiredo.datastructures.list;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LinkedListTests {

	@Test
	public void testEmpty() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	public void testFourItems() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Integer[] items = new Integer[] { 1, 2, 3, 4 };
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		
		assertFalse(list.isEmpty());
		assertEquals(4, list.size());
		
		assertTrue(Arrays.equals(items, list.toArray()));
		
	}
	
}
