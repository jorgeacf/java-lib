package com.jf.structures.connectivity;

public class QuickFind implements UnionFind {

    private int[] id;
    private int count;

    public QuickFind(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    private void validate(int p) {
        int N = id.length;
        if(p < 0 || p >= N) {
            String msg = String.format("The value %d is invalid for the parameter p that accept values between %d and %d.", p, 0, N);
            throw new IndexOutOfBoundsException(msg);
        }
    }

    public int find(int p) {
        validate(p);
        return id[p];
    }

    public boolean connected(int p, int q) {
        validate(p);
        validate(q);
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pi = id[p];
        int qi = id[q];
        if(pi == qi) { return; }
        for(int i = 0; i < id.length; i++) {
            if(id[i] == pi) { id[i] = qi; }
        }
        count--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < id.length; i++) {
            if(sb.length() != 0) { sb.append(", "); }
            sb.append(id[i]);
        }
        sb.insert(0, "[");
        sb.insert(sb.length(), "]");
        return sb.toString();
    }
}
