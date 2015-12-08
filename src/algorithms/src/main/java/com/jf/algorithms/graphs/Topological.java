package com.jf.algorithms.graphs;

import com.jf.stuctures.graphs.Graph;
import com.jf.stuctures.graphs.Edge;

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
