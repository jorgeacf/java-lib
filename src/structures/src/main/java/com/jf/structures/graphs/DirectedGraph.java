package com.jf.structures.graphs;

public class DirectedGraph extends Graph<DirectedEdge> {

    public DirectedGraph(int V) {
        super(V);
    }

    @Override
    protected void validateVertex(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
    }

    @Override
    protected void addEdgeX(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        adj[v].add(e);
        indegree[w]++;
    }
}
