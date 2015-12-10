package com.jf.algorithms.graphs;

import com.jf.structures.graphs.DirectedEdge;
import com.jf.structures.graphs.Graph;
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
