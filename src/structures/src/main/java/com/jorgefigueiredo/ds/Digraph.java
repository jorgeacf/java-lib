package com.jorgefigueiredo.ds;

public class Digraph {

	private final int V;
	private int E;
	private Bag<Integer>[] adj;
	private int[] indegree;
	
	@SuppressWarnings("unchecked")
	public Digraph(int V) {
		if(V < 0) throw new IllegalArgumentException();
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		adj = (Bag<Integer>[])new Bag[V];
		for(int v = 0; v < V; v++) {
			adj[v] = new Bag<Integer>();
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
	
	public void addEdge(int v, int w) {
		validateVertex(v);
		validateVertex(w);
		adj[v].add(w);
		indegree[w]++;
		E++;
	}
	
	public Iterable<Integer> adj(int v) {
		validateVertex(v);
		return adj[v];
	}
}
