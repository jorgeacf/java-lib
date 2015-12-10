package com.jf.structures.graphs;

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

	public boolean isCycle() { return from == to; }

	@Override
	public String toString() {
		return String.format("[%d->%d]", from, to);
	}
	
}
