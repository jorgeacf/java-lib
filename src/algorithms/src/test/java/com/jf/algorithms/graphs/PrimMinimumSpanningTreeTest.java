package com.jf.algorithms.graphs;

import com.jf.structures.graphs.UndirectedWeightedEdge;
import com.jf.structures.graphs.UndirectedWeightedGraph;
import junit.framework.TestCase;

public class PrimMinimumSpanningTreeTest extends TestCase {

    public void testMST() {

        int V = 8;
        UndirectedWeightedGraph graph = new UndirectedWeightedGraph(V);

        graph.addEdge(new UndirectedWeightedEdge(4, 5, 0.35));
        graph.addEdge(new UndirectedWeightedEdge(4, 7, 0.37));
        graph.addEdge(new UndirectedWeightedEdge(5, 7, 0.28));
        graph.addEdge(new UndirectedWeightedEdge(0, 7, 0.16));
        graph.addEdge(new UndirectedWeightedEdge(1, 5, 0.32));
        graph.addEdge(new UndirectedWeightedEdge(0, 4, 0.38));
        graph.addEdge(new UndirectedWeightedEdge(2, 3, 0.17));
        graph.addEdge(new UndirectedWeightedEdge(1, 7, 0.19));
        graph.addEdge(new UndirectedWeightedEdge(0, 2, 0.26));
        graph.addEdge(new UndirectedWeightedEdge(1, 2, 0.36));
        graph.addEdge(new UndirectedWeightedEdge(1, 3, 0.29));
        graph.addEdge(new UndirectedWeightedEdge(2, 7, 0.34));
        graph.addEdge(new UndirectedWeightedEdge(6, 2, 0.40));
        graph.addEdge(new UndirectedWeightedEdge(3, 6, 0.52));
        graph.addEdge(new UndirectedWeightedEdge(6, 0, 0.58));
        graph.addEdge(new UndirectedWeightedEdge(6, 4, 0.93));

        PrimMinimumSpanningTree mst = new PrimMinimumSpanningTree(graph);
        double weight = mst.weight();

        for(UndirectedWeightedEdge e : mst.edges()) {
            System.out.println(String.format("%d %d %.2f", e.from(), e.to(), e.weight()));
        }

        assertEquals(1.84, weight);

    }

    public void testExample() {

        int V = 8;
        KruskalMinimumSpanningTree.EdgeWeightedGraph graph = new KruskalMinimumSpanningTree.EdgeWeightedGraph(V);

        graph.addEdge(new KruskalMinimumSpanningTree.Edge(4, 5, 0.35));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(4, 7, 0.37));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(5, 7, 0.28));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(0, 7, 0.16));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(1, 5, 0.32));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(0, 4, 0.38));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(2, 3, 0.17));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(1, 7, 0.19));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(0, 2, 0.26));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(1, 2, 0.36));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(1, 3, 0.29));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(2, 7, 0.34));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(6, 2, 0.40));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(3, 6, 0.52));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(6, 0, 0.58));
        graph.addEdge(new KruskalMinimumSpanningTree.Edge(6, 4, 0.93));

        KruskalMinimumSpanningTree mst = new KruskalMinimumSpanningTree(graph);
        double weight = mst.weight();

        for(KruskalMinimumSpanningTree.Edge e : mst.edges()) {
            System.out.println(String.format("%d %d %.2f", e.either(), e.other(e.either()), e.weight()));
        }

        assertEquals(1.81, weight);

    }


}
