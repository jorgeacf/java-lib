package com.jf.algorithms.graphs;

import com.jf.structures.graphs.Graph;
import com.jf.structures.graphs.Edge;

/**
 *  This class compute the topological ordering of a DAG or edge-weighted DAG.
 *  The running cost is O(E + V) time.
 * @param <E> Type of edge in the graph
 */
public class Topological<E extends Edge> {

	private Iterable<Integer> order;
	private int[] rank;
	
	public Topological(Graph<E> G) {
		
		DirectedCycle<E> finder = new DirectedCycle<E>(G);
		
		if(!finder.hasCycle()) {
			DepthFirstOrder<E> dfs = new DepthFirstOrder<E>(G);
			order = dfs.reversePost();
			rank = new int[G.V()];
			int i = 0;
			for(int v : order) {
				rank[v] = i++;
			}
		}
	}
	
	public Iterable<Integer> order() {
		return order;
	}
	
	public boolean hasOrder() {
		return order != null;
	}
	
}
