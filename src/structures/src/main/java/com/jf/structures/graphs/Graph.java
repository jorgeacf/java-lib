package com.jf.structures.graphs;

import com.jf.structures.list.Bag;

import java.util.LinkedList;
import java.util.List;

public abstract class Graph<EDGE> {

	protected final int V;
	protected int E;
	protected Bag<EDGE>[] adj;
	protected int[] indegree;
	
	@SuppressWarnings("unchecked")
    public Graph(int V) {
		if(V < 0) throw new IllegalArgumentException();
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		adj = (Bag<EDGE>[])new Bag[V];
		for(int v = 0; v < V; v++) {
			adj[v] = new Bag<EDGE>();
		}
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	protected void validateVertex(int v) {
		if(v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
	}

	protected abstract void validateVertex(EDGE e);
    protected abstract void addEdgeX(EDGE e);

	public void addEdge(EDGE e) {
        validateVertex(e);
        addEdgeX(e);
		E++;
	}

	public Iterable<EDGE> edges() {
		List<EDGE> list = new LinkedList<EDGE>();
		for(int v = 0; v < V; v++) {
			for(EDGE e : adj(v)) {
				list.add(e);
			}
		}
		return list;
	}
	
	public Iterable<EDGE> adj(int v) {
		validateVertex(v);
		return adj[v];
	}
}