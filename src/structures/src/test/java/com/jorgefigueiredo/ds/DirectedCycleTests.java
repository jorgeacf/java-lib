package com.jorgefigueiredo.ds;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jorgefigueiredo.ds.Digraph;
import com.jorgefigueiredo.ds.DirectedCycle;

public class DirectedCycleTests {

	@Test
	public void testWithoutCycle() {
		
		Digraph digraph = new Digraph(3);
		
		digraph.addEdge(1, 0);
		digraph.addEdge(1, 2);
		
		DirectedCycle directedCycle = new DirectedCycle(digraph);
		
		assertFalse(directedCycle.hasCycle());
	}

	@Test
	public void testWithCycle() {
		
		Digraph digraph = new Digraph(3);
		
		digraph.addEdge(1, 0);
		digraph.addEdge(0, 2);
		digraph.addEdge(2, 1);
		
		DirectedCycle directedCycle = new DirectedCycle(digraph);
		
		assertTrue(directedCycle.hasCycle());
	}
	
	@Test
	public void testWithoutCycle2() {
		
		Digraph digraph = new Digraph(5);
		
		digraph.addEdge(0, 1);
		digraph.addEdge(1, 2);
		
		digraph.addEdge(2, 4);
		digraph.addEdge(4, 3);
		digraph.addEdge(2, 3);
		
		digraph.addEdge(0, 3);
		
		DirectedCycle directedCycle = new DirectedCycle(digraph);
		
		assertFalse(directedCycle.hasCycle());
	}
	
	@Test
	public void testWithCycle2() {
		
		Digraph digraph = new Digraph(5);
		
		digraph.addEdge(0, 1);
		digraph.addEdge(1, 2);
		
		digraph.addEdge(2, 4);
		digraph.addEdge(4, 3);
		digraph.addEdge(2, 3);
		
		digraph.addEdge(3, 0);
		
		DirectedCycle directedCycle = new DirectedCycle(digraph);
		
		assertTrue(directedCycle.hasCycle());
	}
}
