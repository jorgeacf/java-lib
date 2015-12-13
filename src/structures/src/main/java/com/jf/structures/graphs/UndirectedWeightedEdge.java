package com.jf.structures.graphs;

public class UndirectedWeightedEdge implements Edge {

    private final int from;
    private final int to;
    private final double weight;

    public UndirectedWeightedEdge(int from, int to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int from() {
        return from;
    }

    public int to() {
        return to;
    }

    public double weight() { return weight; }

    public int compareTo(Edge edge) {
        int BEFORE = -1;
        int EQUAL = 0;
        int AFTER = 1;

        if(this == edge) { return EQUAL; }

        UndirectedWeightedEdge that = (UndirectedWeightedEdge)edge;
        if(this.from() < that.from()) { return BEFORE; }
        if(this.from() > that.from()) { return AFTER; }

        if(this.to() < that.to()) { return BEFORE; }
        if(this.to() > that.to()) { return AFTER; }

        if(this.weight() < that.weight()) { return BEFORE; }
        if(this.weight() > that.weight()) { return AFTER; }

        return EQUAL;
    }
}
