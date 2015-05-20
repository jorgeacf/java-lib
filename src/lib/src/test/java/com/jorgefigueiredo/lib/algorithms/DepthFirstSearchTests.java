package com.jorgefigueiredo.lib.algorithms;

import com.jorgefigueiredo.lib.datascructures.Graph;

import junit.framework.TestCase;

public class DepthFirstSearchTests extends TestCase {

	
	public void testGraph() {
		
		Graph g = new Graph(5);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		
		assertEquals(g.V(), 5);
		assertEquals(g.E(), 3);
		
		//System.out.print(g.toString());
	}
	
	public void testDepthFirstSearch() {
		
		
		Graph g = new Graph(5);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		
		DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g, 1);
		
		assertTrue(depthFirstSearch.marked(0));
		assertTrue(depthFirstSearch.marked(1));
		assertTrue(depthFirstSearch.marked(2));
		assertFalse(depthFirstSearch.marked(3));
		assertTrue(depthFirstSearch.marked(4));
		
		assertEquals(depthFirstSearch.count(), 4);
		
	}
	
}
