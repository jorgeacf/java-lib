package com.jorgefigueiredo.structures;

public class Topological {

	private Iterable<Integer> order;
	private int[] rank;
	
	public Topological(Digraph G) {
		
		DirectedCycle finder = new DirectedCycle(G);
		
		if(!finder.hasCycle()) {
			DepthFirstOrder dfs = new DepthFirstOrder(G);
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
