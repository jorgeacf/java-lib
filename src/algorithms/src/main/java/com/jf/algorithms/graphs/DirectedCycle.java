package com.jf.algorithms.graphs;

import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.Graph;

import java.util.Stack;

public class DirectedCycle<E extends DirectedEdge> {

	private boolean[] marked;
	private int[] edgeTo;
	private boolean[] onStack;
	private Stack<Integer> cycle;
	
	public DirectedCycle(Graph<E> G) {
		marked = new boolean[G.V()];
		onStack = new boolean[G.V()];
		edgeTo = new int[G.V()];
		
		for(int v = 0; v < G.V(); v++) {
			if(!marked[v] && cycle == null) {
				dfs(G, v);
			}
		}
	}
	
	
	private void dfs(Graph<E> G, int v) {
		
		onStack[v] = true;
		marked[v] = true;
		
		for(DirectedEdge e : G.adj(v)) {
			
			int w = e.to();
			if(cycle != null) {
				return;
			}
			else if (!marked[w]) {
				edgeTo[w] = v;
				dfs(G, w);
			}
			else if (onStack[w]) {
				cycle = new Stack<Integer>();
				for(int x = v; x != w; x = edgeTo[x]) {
					cycle.push(x);
				}
				cycle.push(w);
				cycle.push(v);
			}
			
		}
		
		onStack[v] = false;
	}
	
	public boolean hasCycle() {
		return cycle != null;
	}
	
	public Iterable<Integer> cycle() {
		return cycle;
	}
}
