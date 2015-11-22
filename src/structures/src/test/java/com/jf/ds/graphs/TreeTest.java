package com.jf.ds.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

	@Test
	public void testEmptyTree() {
		
		Tree<Integer, Integer> tree = new Tree<Integer, Integer>();
		
		assertTrue(tree.isEmpty());
		assertEquals(0, tree.size());
		
	}
	
	@Test
	public void testOneElement() {
		
		Tree<Integer, Integer> tree = new Tree<Integer, Integer>();
		
		int X = 5;
		
		tree.put(X, X);
		
		assertFalse(tree.isEmpty());
		assertEquals(1, tree.size());
		assertTrue(tree.contains(X));
		assertEquals(new Integer(X), tree.get(X));
	}
	
	@Test
	public void testThreeElements() {
		
		Tree<Integer, Integer> tree = new Tree<Integer, Integer>();
		
		int X1 = 5;
		int X2 = 1;
		int X3 = 7;
		
		tree.put(X1, X1);
		tree.put(X2, X2);
		tree.put(X3, X3);
		
		assertFalse(tree.isEmpty());
		assertEquals(3, tree.size());
		
		assertTrue(tree.contains(X1));
		assertTrue(tree.contains(X2));
		assertTrue(tree.contains(X3));
		
		assertEquals(new Integer(X1), tree.get(X1));
		assertEquals(new Integer(X2), tree.get(X2));
		assertEquals(new Integer(X3), tree.get(X3));
	}

}
