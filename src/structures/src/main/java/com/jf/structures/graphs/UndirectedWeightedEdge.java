package com.jf.structures.graphs;

public class UndirectedWeightedEdge extends UndirectedEdge {

    private final double weight;

    public UndirectedWeightedEdge(int v, int w, double weight)  {
        super(v, w);
        this.weight = weight;
    }

    public double weight() { return weight; }

    public int compareTo(UndirectedWeightedEdge that) {

        if(this.weight < that.weight) { return -1; }
        if(this.weight > that.weight) { return 1; }

        return super.compareTo(that);
    }

    @Override
    public String toString() {
        return String.format("(v,w,weight)(%d,%d,%d)", either(), other(either()), weight());
    }
}
