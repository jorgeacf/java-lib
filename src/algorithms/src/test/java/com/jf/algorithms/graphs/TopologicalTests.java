package com.jf.algorithms.graphs;

import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.DirectedGraph;
import com.jf.structures.graphs.Graph;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class TopologicalTests {

	@Test
	public void testNoOrder() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(3);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(2, 1));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
		
		assertFalse(topological.hasOrder());
	}
	
	@Test
	public void testThreeV() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(3);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());

		assertEquals(new Integer(0), order.next());
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(1), order.next());
	}
	
	@Test
	public void testFiveV() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(5);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		
		digraph.addEdge(new DirectedEdge(0, 3));
		digraph.addEdge(new DirectedEdge(0, 4));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());

		assertEquals(new Integer(4), order.next());
		assertEquals(new Integer(3), order.next());
		assertEquals(new Integer(0), order.next());
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(1), order.next());
		// Confirm that the order is correct

	}
	
}