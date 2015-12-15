package com.jf.algorithms.graphs;

import com.jf.utils.RandomUtils;
import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.DirectedGraph;
import com.jf.structures.graphs.Graph;

import java.util.LinkedHashSet;
import java.util.Set;

public final class GraphGenerator {

    private GraphGenerator() { }

    public static Graph simple(int V, int E) {

        if(V <= 0) { throw new IllegalArgumentException("The number of vertices (V) must be greater than zero."); }
        if(E >= ((V-1)*V)) { throw new IllegalArgumentException("The maximum number of edges is " + (V-1)*V + "."); }

        Graph graph = new DirectedGraph(V);

        Set<DirectedEdge> edgesSet = new LinkedHashSet<DirectedEdge>();

        while(graph.E() < E) {

            int v = RandomUtils.uniform(V);
            int w = RandomUtils.uniform(V);

            DirectedEdge edge = new DirectedEdge(v, w);

            if (!edge.isCycle() && !edgesSet.contains(edge)) {
                edgesSet.add(edge);
                graph.addEdge(edge);
            }
        }

        return graph;
    }

}
