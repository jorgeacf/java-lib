package com.jf.structures.connectivity;

public class QuickUnion implements UF {

    private int[] parent;
    private int count;

    public QuickUnion(int N) {
        count = N;
        parent = new int[N];
        for(int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    public void union(int p, int q) {

        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ) { return; }
        parent[rootP] = rootQ;
        count--;
    }

    private void validate(int p) {
        int N = parent.length;
        if(p < 0 || p >= N) {
            String msg = String.format("The value %d is invalid for the parameter p that accept values between %d and %d.", p, 0, N);
            throw new IndexOutOfBoundsException(msg);
        }
    }

    public int find(int p) {
        validate(p);
        while(p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }
}
