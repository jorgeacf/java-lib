package com.jf.algorithms.graphs;

import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.DirectedGraph;
import com.jf.structures.graphs.Graph;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DirectedCycleTest {

	@Test
	public void testWithoutCycle() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(3);
		
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(1, 2));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertFalse(directedCycle.hasCycle());
	}

	@Test
	public void testWithCycle() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(3);
		
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(0, 2));
		digraph.addEdge(new DirectedEdge(2, 1));
		
		DirectedCycle<DirectedEdge> directedCycle = new DirectedCycle<DirectedEdge>(digraph);
		
		assertTrue(directedCycle.hasCycle());
	}
	
	@Test
	public void testWithoutCycle2() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(5);
		
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
		
		Graph<DirectedEdge> digraph = new DirectedGraph(5);
		
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
