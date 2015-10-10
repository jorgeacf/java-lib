package com.jorgefigueiredo.structures;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TopologicalTests {

	@Test
	public void testNoOrder() {
		
		Digraph digraph = new Digraph(3);

		digraph.addEdge(1, 2);
		digraph.addEdge(1, 0);
		digraph.addEdge(2, 1);
		
		Topological topological = new Topological(digraph);
		
		assertFalse(topological.hasOrder());
	}
	
	@Test
	public void testThreeV() {
		
		Digraph digraph = new Digraph(3);

		digraph.addEdge(1, 2);
		digraph.addEdge(1, 0);
		
		Topological topological = new Topological(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());
		assertEquals(new Integer(1), order.next());
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(0), order.next());
	}
	
	@Test
	public void testFiveV() {
		
		Digraph digraph = new Digraph(5);

		digraph.addEdge(1, 2);
		digraph.addEdge(1, 0);
		
		digraph.addEdge(0, 3);
		digraph.addEdge(0, 4);
		
		Topological topological = new Topological(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());
		assertEquals(new Integer(1), order.next());
		
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(0), order.next());
		
		assertEquals(new Integer(3), order.next());
		assertEquals(new Integer(4), order.next());
	}
	
}