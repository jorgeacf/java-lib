package com.jf.stuctures.graphs;

import java.util.LinkedList;
import java.util.List;

import com.jf.stuctures.Bag;

public class DirectedGraph<EDEGE extends Edge> {

	private final int V;
	private int E;
	private Bag<EDEGE>[] adj;
	private int[] indegree;
	
	@SuppressWarnings("unchecked")
	public DirectedGraph(int V) {
		if(V < 0) throw new IllegalArgumentException();
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		adj = (Bag<EDEGE>[])new Bag[V];
		for(int v = 0; v < V; v++) {
			adj[v] = new Bag<EDEGE>();
		}
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	private void validateVertex(int v) {
		if(v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
	}
	
	public void addEdge(EDEGE e) {
		int v = e.from();
		int w = e.to();
		validateVertex(v);
		validateVertex(w);
		adj[v].add(e);
		indegree[w]++;
		E++;
	}
	
	public Iterable<EDEGE> edges() {
		List<EDEGE> list = new LinkedList<EDEGE>();
		for(int v = 0; v < V; v++) {
			for(EDEGE e : adj(v)) {
				list.add(e);
			}
		}
		return list;
	}
	
	public Iterable<EDEGE> adj(int v) {
		validateVertex(v);
		return adj[v];
	}
}
