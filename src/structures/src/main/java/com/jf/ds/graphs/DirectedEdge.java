package com.jf.ds.graphs;

public class DirectedEdge implements Edge {

	private final int from;
	private final int to;
	
	public DirectedEdge(int from, int to) {
		this.from = from;
		this.to = to;
	}
	
	public int from() {
		return from;
	}

	public int to() {
		return to;
	}

	@Override
	public String toString() {
		return String.format("[%d->%d]", from, to);
	}
	
}
