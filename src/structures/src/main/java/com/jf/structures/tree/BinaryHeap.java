package com.jf.structures.tree;

import java.util.NoSuchElementException;

/**
 *  its left child is located at 2*k index
 *  its right child is located at 2*k+1. index
 *  its parent is located at k/2 index
 */

public final class BinaryHeap<T extends Comparable<T>> {

    private static final int d = 2;
    private int size;
    private T[] heap;

    public BinaryHeap(int capacity) {
        size = 0;
        heap = (T[])new Comparable[capacity + 1];
        //Arrays.fill(heap, -1);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public void clear() {
        size = 0;
    }

    public void insert(T x) {
        if(isFull()) {
            throw new NoSuchElementException("Overflow Exception");
        }
        int n = size;
        heap[n] = x;
        heapfyUp(n);
        size++;
    }

    public T findMin() {
        if(isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return heap[0];
    }

    public T deleteMin() {
        T keyItem = heap[0];
        delete(0);
        return keyItem;
    }

    public T delete(int i) {
        if(isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        T keyItem = heap[i];
        heap[i] = heap[size - 1];
        size--;
        heapifyDown(i);
        return keyItem;
    }

    private void heapfyUp(int i) {
        T tmp = heap[i];
        while(i > 0 && tmp.compareTo(heap[parent(i)]) < 0) {
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = tmp;
    }

    private void heapifyDown(int i) {

        int child;
        T tmp = heap[i];
        while(kthChild(i, 1) < size) {
            child = minChild(i);
            if(heap[child].compareTo(tmp) < 0) {
                heap[i] = heap[child];
            }
            else {
                break;
            }
            i = child;
        }
        heap[i] = tmp;
    }

    private int minChild(int i) {
        int bestChild = kthChild(i, 1);
        int k = 2;
        int pos = kthChild(i, k);
        while((k <= d) && (pos < size)) {
            if(heap[pos].compareTo(heap[bestChild]) < 0) {
                bestChild = pos;
            }
            pos = kthChild(i, k++);
        }
        return bestChild;
    }

    private int parent(int i) {
        return (i - 1) / d;
    }

    private int kthChild(int i, int k) {
        return d * i + k;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++) {

            if(sb.length() != 0) { sb.append(", "); }
            sb.append(heap[i]);
        }

        sb.insert(0, "[");
        sb.insert(sb.length(), "]");

        return sb.toString();
    }

}
