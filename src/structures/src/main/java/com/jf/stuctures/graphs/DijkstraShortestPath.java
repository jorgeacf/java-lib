package com.jf.stuctures.graphs;

import java.util.Stack;

public class DijkstraShortestPath implements ShortestPath<DirectedWeightedEdge> {

	private double[] distTo;
	private DirectedWeightedEdge[] edgeTo;
	private IndexedPriorityQueue<Double> pq;
	
	public DijkstraShortestPath(DirectedGraph<DirectedWeightedEdge> G, int s) {
		
		for(DirectedWeightedEdge e : G.edges()) {
			if(e.weight() < 0) {
				throw new IllegalArgumentException("edge " + e + " has negative weight");
			}
		}
		
		distTo = new double[G.V()];
		edgeTo = new DirectedWeightedEdge[G.V()];
		
		for(int v = 0; v < G.V(); v++) {
			distTo[v] = Double.POSITIVE_INFINITY;
		}
		distTo[s] = 0.0;
		
		pq = new IndexedPriorityQueue<Double>(G.V());
		pq.insert(s, distTo[s]);
		while(!pq.isEmpty()) {
			int v = pq.delMin();
			for(DirectedWeightedEdge e : G.adj(v)) {
				relax(e);
			}
		}
	}
	
	private void relax(DirectedWeightedEdge e) {
		int v = e.from();
		int w = e.to();
		
		if(distTo[w] > distTo[v] + e.weight()) {
			
			distTo[w] = distTo[v] + e.weight();
			edgeTo[w] = e;
			
			if(pq.contains(w)) {
				pq.decreaseKey(w, distTo[w]);
			}
			else {
				pq.insert(w, distTo(w));
			}
		}
		
	}
	
	public double distTo(int v) {
		return distTo[v];
	}

	public boolean hasPathTo(int v) {
		return distTo[v] < Double.POSITIVE_INFINITY;
	}

	public Iterable<DirectedWeightedEdge> pathTo(int v) {
		
		if(!hasPathTo(v)) { return null; }
		
		Stack<DirectedWeightedEdge> path = new Stack<DirectedWeightedEdge>();
		
		for(DirectedWeightedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
			path.push(e);
		}
		
		return path;
	}

}
