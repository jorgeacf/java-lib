package com.jf.algorithms.graphs;

import com.jf.algorithms.utils.RandomUtils;
import com.jf.stuctures.graphs.DirectedEdge;
import com.jf.stuctures.graphs.DirectedGraph;
import com.jf.stuctures.graphs.Graph;
import com.jf.stuctures.graphs.Edge;

import java.util.LinkedHashSet;
import java.util.Set;

public final class GraphGenerator {

    private GraphGenerator() { }

    public static Graph simple(int V, int E) {

        if(V <= 0) { throw new IllegalArgumentException("The number of vertices (V) must be greater than zero."); }
        if(E >= ((V-1)*V)) { throw new IllegalArgumentException("The maximum number of edges is " + (V-1)*V + "."); }

        Graph graph = new DirectedGraph(V);

        Set<Edge> edgesSet = new LinkedHashSet<Edge>();

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
