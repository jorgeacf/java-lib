package com.jf.structures.graphs;

public class DirectedEdge implements Comparable<DirectedEdge> {

	private final Integer from;
	private final Integer to;
	
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

	public int compareTo(DirectedEdge that) {

		if(this == that) { return 0; }

		if(this.from < that.from) { return -1; }
		if(this.from > that.from) { return 1; }

		if(this.to < that.to) { return -1; }
		if(this.to > that.to) { return 1; }

		return 0;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof DirectedEdge) {
			DirectedEdge e = (DirectedEdge)obj;
			return from.equals(e.from) && to.equals(e.to);
		}
		return false;
	}

	@Override
	public int hashCode() {

		int hash = 17;
		hash = 31 * hash + from;
		hash = 31 * hash + to;
		return hash;
	}

	@Override
	public String toString() {
		return String.format("(from,to)(%s,%s)", from, to);
	}

}
