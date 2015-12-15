package com.jf.structures.graphs;

public class UndirectedEdge implements Comparable<UndirectedEdge> {

    private final int v;
    private final int w;

    public UndirectedEdge(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public int either() {
        return v;
    }

    public int other(int vertex) {
        if(vertex == v) { return w; }
        if(vertex == w) { return v; }
        throw new IllegalArgumentException("Illegal vertex");
    }

    public int compareTo(UndirectedEdge that) {

        if(this == that) { return 0; }

        if(this.v < that.v) { return -1; }
        if(this.v > that.v) { return 1; }

        if(this.w < that.w) { return -1; }
        if(this.w > that.w) { return 1; }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("(v,w)(%d,%d)", v, w);
    }
}
