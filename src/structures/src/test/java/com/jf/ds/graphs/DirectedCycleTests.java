package com.jf.ds.graphs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jf.ds.graphs.DirectedGraph;
import com.jf.ds.graphs.DirectedCycle;

public class DirectedCycleTests {

	@Test
	public void testWithoutCycle() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(3);
		
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(1, 2));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertFalse(directedCycle.hasCycle());
	}

	@Test
	public void testWithCycle() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(3);
		
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(0, 2));
		digraph.addEdge(new DirectedEdge(2, 1));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertTrue(directedCycle.hasCycle());
	}
	
	@Test
	public void testWithoutCycle2() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(5);
		
		digraph.addEdge(new DirectedEdge(0, 1));
		digraph.addEdge(new DirectedEdge(1, 2));
		
		digraph.addEdge(new DirectedEdge(2, 4));
		digraph.addEdge(new DirectedEdge(4, 3));
		digraph.addEdge(new DirectedEdge(2, 3));
		
		digraph.addEdge(new DirectedEdge(0, 3));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertFalse(directedCycle.hasCycle());
	}
	
	@Test
	public void testWithCycle2() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(5);
		
		digraph.addEdge(new DirectedEdge(0, 1));
		digraph.addEdge(new DirectedEdge(1, 2));
		
		digraph.addEdge(new DirectedEdge(2, 4));
		digraph.addEdge(new DirectedEdge(4, 3));
		digraph.addEdge(new DirectedEdge(2, 3));
		
		digraph.addEdge(new DirectedEdge(3, 0));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertTrue(directedCycle.hasCycle());
	}
}
