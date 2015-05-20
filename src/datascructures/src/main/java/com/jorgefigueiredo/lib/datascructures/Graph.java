package com.jorgefigueiredo.lib.datascructures;



public class Graph {

	private final int V;
	private int E;
	private Bag<Integer>[] adj;
	
	
	@SuppressWarnings("unchecked")
	public Graph(int V) {
		
		if(V < 0) { throw new IllegalArgumentException("The number of vertices must be positive."); }
		
		this.V = V;
		this.E = 0;
		
		adj = (Bag<Integer>[]) new Bag[V];
		
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
		if( v < 0 || v >= V) {
			throw new IndexOutOfBoundsException("Vertex " + v + "is not between 0 and " + (V-1));
		}
	}
	
	public void addEdge(int v, int w) {
		
		validateVertex(v);
		validateVertex(w);
		E++;
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public Iterable<Integer> adj(int v) {
		validateVertex(v);
		return adj[v];
	}
	
	public int degree(int v) {
		validateVertex(v);
		return adj[v].size();
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		String NEWLINE = System.getProperty("line.separator");
		s.append(V + " vertices, " + E + " edges " + NEWLINE);
		
		for(int v = 0; v < V; v++) {
			
			s.append(v + ": ");
			for(int w : adj[v]) {
				s.append(w + " ");
			}
			s.append(NEWLINE);
		}
		
		return s.toString();
	}
	
}
