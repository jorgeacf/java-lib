package com.jf.structures.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleLinkedListTest {

	@Test
	public void testEmpty() {
		
		SingleLinkedList<Integer> list = new SingleLinkedList();
		
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	public void testFourItems() {

		SingleLinkedList<Integer> list = new SingleLinkedList();
		
		Integer[] items = new Integer[] { 1, 2, 3, 4 };
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		
		assertFalse(list.isEmpty());
		assertEquals(4, list.size());
		
		//assertTrue(Arrays.equals(items, list.toArray()));
		
	}
	
}
