package com.jf.structures.graphs;

import com.jf.structures.list.Bag;

import java.util.LinkedList;
import java.util.List;

public abstract class Graph<EE> {

	protected final int V;
	protected int E;
	protected Bag<EE>[] adj;
	protected int[] indegree;
	
	@SuppressWarnings("unchecked")
    public Graph(int V) {
		if(V < 0) throw new IllegalArgumentException();
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		adj = (Bag<EE>[])new Bag[V];
		for(int v = 0; v < V; v++) {
			adj[v] = new Bag<EE>();
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

	protected abstract void validateVertex(EE e);
    protected abstract void addEdgeX(EE e);

	public void addEdge(EE e) {
        validateVertex(e);
        addEdgeX(e);
		E++;
	}


	
	public Iterable<EE> edges() {
		List<EE> list = new LinkedList<EE>();
		for(int v = 0; v < V; v++) {
			for(EE e : adj(v)) {
				list.add(e);
			}
		}
		return list;
	}
	
	public Iterable<EE> adj(int v) {
		validateVertex(v);
		return adj[v];
	}
}
