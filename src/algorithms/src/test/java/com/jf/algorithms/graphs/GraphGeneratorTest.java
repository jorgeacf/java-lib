package com.jf.algorithms.graphs;

import com.jf.stuctures.graphs.DirectedEdge;
import com.jf.stuctures.graphs.Graph;
import junit.framework.TestCase;

public class GraphGeneratorTest extends TestCase {

    public void testGenerateSimpleGraph() {

        int E = 5;
        int V = 10;

        Graph<DirectedEdge> graph = GraphGenerator.simple(V, E);

        assertEquals(E, graph.E());
        assertEquals(V, graph.V());
    }

}
