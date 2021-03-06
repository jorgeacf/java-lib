package com.jf.algorithms.graphs;

public interface ShortestPath<E> {

	double distTo(int v);
	boolean hasPathTo(int v);
	Iterable<E> pathTo(int v);
	
}
