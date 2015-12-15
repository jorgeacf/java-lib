package com.jf.structures.graphs;

public class DirectedWeightedEdge extends DirectedEdge {

	private final Integer weight;
	
	public DirectedWeightedEdge(int from, int to, int weight) {
		super(from, to);
		this.weight = weight;
	}

	public int weight() {
		return weight;
	}

	public int compareTo(DirectedWeightedEdge that) {

		if(this.weight < that.weight) { return -1; }
		if(this.weight > that.weight) { return 1; }

		return super.compareTo(that);
	}

	@Override
	public String toString() {
		return String.format("(from,to,weight)(%d,%d,%d)", from(), to(), weight());
	}
}
