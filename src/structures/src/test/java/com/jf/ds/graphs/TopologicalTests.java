package com.jf.ds.graphs;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import com.jf.ds.graphs.DirectedGraph;
import com.jf.ds.graphs.Topological;

public class TopologicalTests {

	@Test
	public void testNoOrder() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(3);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(2, 1));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
		
		assertFalse(topological.hasOrder());
	}
	
	@Test
	public void testThreeV() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(3);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());
		assertEquals(new Integer(1), order.next());
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(0), order.next());
	}
	
	@Test
	public void testFiveV() {
		
		DirectedGraph<DirectedEdge> digraph = new DirectedGraph<DirectedEdge>(5);

		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 0));
		
		digraph.addEdge(new DirectedEdge(0, 3));
		digraph.addEdge(new DirectedEdge(0, 4));
		
		Topological<DirectedEdge> topological = new Topological<DirectedEdge>(digraph);
	
		Iterator<Integer> order = topological.order().iterator();
		
		assertTrue(topological.hasOrder());
		assertEquals(new Integer(1), order.next());
		
		assertEquals(new Integer(2), order.next());
		assertEquals(new Integer(0), order.next());
		
		assertEquals(new Integer(3), order.next());
		assertEquals(new Integer(4), order.next());
	}
	
}