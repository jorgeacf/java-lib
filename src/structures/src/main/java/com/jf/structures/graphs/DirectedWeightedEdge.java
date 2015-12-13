package com.jf.structures.graphs;

public class DirectedWeightedEdge implements Edge {

	private final Integer from;
	private final Integer to;
	private final Integer weight;
	
	public DirectedWeightedEdge(int from, int to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public int from() {
		return from;
	}

	public int to() {
		return to;
	}

	public int weight() {
		return weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof DirectedWeightedEdge) {
			DirectedWeightedEdge e = (DirectedWeightedEdge)obj;
			return from.equals(e.from) && to.equals(e.to) && weight.equals(weight);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int hash = 17;
		
		hash = 31 * hash + from;
		hash = 31 * hash + to;
		hash = 31 * hash + weight;
		
		return hash;
		
	}

	public int compareTo(Edge o) {
		return 0;
	}
}
