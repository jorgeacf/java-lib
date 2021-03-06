package com.jf.algorithms.graphs;

import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.DirectedGraph;
import com.jf.structures.graphs.Graph;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class DepthFirstOrderTest {

	@Test
	public void test() {
		
		Graph<DirectedEdge> digraph = new DirectedGraph(6);
		
		digraph.addEdge(new DirectedEdge(1, 0));
		digraph.addEdge(new DirectedEdge(1, 2));
		digraph.addEdge(new DirectedEdge(1, 3));
		
		digraph.addEdge(new DirectedEdge(2, 4));
		digraph.addEdge(new DirectedEdge(2, 5));
		
		DepthFirstOrder<DirectedEdge> depthFirstOrder = new DepthFirstOrder<DirectedEdge>(digraph);
		
		Iterator<Integer> pre = depthFirstOrder.pre().iterator();
		Iterator<Integer> post = depthFirstOrder.post().iterator();
		
		// PRE
		assertEquals(new Integer(0), pre.next());
		assertEquals(new Integer(1), pre.next());
		assertEquals(new Integer(3), pre.next());
		assertEquals(new Integer(2), pre.next());
		
		assertEquals(new Integer(5), pre.next());
		assertEquals(new Integer(4), pre.next());

		// POST
		assertEquals(new Integer(0), post.next());
		
		assertEquals(new Integer(3), post.next());
		assertEquals(new Integer(5), post.next());
		assertEquals(new Integer(4), post.next());
		
		assertEquals(new Integer(2), post.next());
		assertEquals(new Integer(1), post.next());
		
	}

}
