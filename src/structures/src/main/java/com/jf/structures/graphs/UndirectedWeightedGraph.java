package com.jf.structures.graphs;

public class UndirectedWeightedGraph extends Graph<UndirectedWeightedEdge> {

    public UndirectedWeightedGraph(int V) {
        super(V);
    }

    @Override
    protected void validateVertex(UndirectedWeightedEdge e) {
        int v = e.either();
        int w = e.other(e.either());
        validateVertex(v);
        validateVertex(w);
    }

    @Override
    protected void addEdgeX(UndirectedWeightedEdge e) {

        int v = e.either();
        int w = e.other(e.either());

        adj[v].add(e);
        adj[w].add(e);

        indegree[w]++;
        indegree[v]++;

    }
}
