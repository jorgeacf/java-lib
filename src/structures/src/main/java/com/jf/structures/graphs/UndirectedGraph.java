package com.jf.structures.graphs;

public class UndirectedGraph extends Graph<UndirectedEdge> {

    public UndirectedGraph(int V) {
        super(V);
    }

    @Override
    protected void validateVertex(UndirectedEdge e) {
        int v = e.either();
        int w = e.other(e.either());
        validateVertex(v);
        validateVertex(w);
    }

    @Override
    protected void addEdgeX(UndirectedEdge e) {

        int v = e.either();
        int w = e.other(e.either());

        adj[v].add(e);
        adj[w].add(e);

        indegree[w]++;
        indegree[v]++;
    }
}
