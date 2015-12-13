package com.jf.algorithms.graphs;

import com.jf.structures.graphs.*;

import java.util.LinkedList;
import java.util.Queue;

public final class PrimMinimumSpanningTree {

    private UndirectedWeightedEdge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    private IndexedPriorityQueue<Double> pq;


    public PrimMinimumSpanningTree(UndirectedWeightedGraph graph) {

        edgeTo = new UndirectedWeightedEdge[graph.V()];
        distTo = new double[graph.V()];
        marked = new boolean[graph.V()];
        pq = new IndexedPriorityQueue<Double>(graph.V());

        for(int v = 0; v < graph.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }

        for(int v = 0; v < graph.V(); v++) {
            if(!marked[v]) { prim(graph, v); };
        }

    }

    private void prim(UndirectedWeightedGraph graph, int s) {
        distTo[s] = 0.0;
        pq.insert(s, distTo[s]);
        while(!pq.isEmpty()) {
            int v = pq.delMin();
            scan(graph, v);
        }
    }

    private void scan(UndirectedWeightedGraph graph, int v) {
        marked[v] = true;
        for(UndirectedWeightedEdge e : graph.adj(v)) {
            int w = e.to();
            if(marked[w]) { continue; }
            if(e.weight() < distTo[w]) {
                distTo[w] = e.weight();
                edgeTo[w] = e;
                if(pq.contains(w))  { pq.decreaseKey(w, distTo[w]); }
                else                { pq.insert(w, distTo[w]); }
            }
        }
    }

    public Iterable<UndirectedWeightedEdge> edges() {
        Queue<UndirectedWeightedEdge> mst = new LinkedList<UndirectedWeightedEdge>();
        for(int v = 0; v < edgeTo.length; v++) {
            UndirectedWeightedEdge e = edgeTo[v];
            if(e != null) {
                mst.add(e);
            }
        }
        return mst;
    }

    public double weight() {
        double weight = 0.0;
        for(UndirectedWeightedEdge e : edges()) {
            weight += e.weight();
        }
        return weight;
    }

}
