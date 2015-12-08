package com.jf.stuctures.graphs;

public class DirectedWeightedGraph extends Graph<DirectedWeightedEdge> {

    public DirectedWeightedGraph(int V) {
        super(V);
    }

    @Override
    protected void validateVertex(DirectedWeightedEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
    }

    @Override
    protected void addEdgeX(DirectedWeightedEdge e) {

        int v = e.from();
        int w = e.to();
        adj[v].add(e);
        indegree[w]++;
    }
}
