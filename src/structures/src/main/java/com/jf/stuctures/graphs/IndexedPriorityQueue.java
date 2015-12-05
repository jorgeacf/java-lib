package com.jf.stuctures.graphs;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IndexedPriorityQueue<Key extends Comparable<Key>> implements Iterable<Integer> {

	private int maxN;
	private int N;
	private int[] pq;
	private int[] qp;
	private Key[] keys;
	
	@SuppressWarnings("unchecked")
	public IndexedPriorityQueue(int maxN) {
		
		if(maxN < 0) throw new IllegalArgumentException();
		this.maxN = maxN;
		keys = (Key[]) new Comparable[maxN + 1];
		pq = new int[maxN + 1];
		qp = new int[maxN + 1];
		
		for(int i = 0; i <= maxN; i++) {
			qp[i] = -1;
		}
		
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean contains(int i) {
		if(i < 0 || i >= maxN) throw new IndexOutOfBoundsException();
		return qp[i] != -1;
	}
	
	public void insert(int i, Key key) {
		if(i < 0 || i >= maxN) throw new IndexOutOfBoundsException();
		if(contains(i)) throw new IllegalArgumentException("Index is already in the priority queue");
		N++;
		qp[i] = N;
		pq[N] = i;
		keys[i] = key;
		swim(N);
	}
	
	public int delMin() {
		if(N == 0) throw new NoSuchElementException("Priority queue underflow");
		int min = pq[1];
		exch(1, N--);
		sink(1);
		qp[min] = -1;
		keys[pq[N+1]] = null;
		pq[N+1] = -1;
		return min;
	}
	
	
	
	
	private boolean greater(int i, int j) {
		return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
	}
	
	private void exch(int i, int j) {
		int swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
		qp[pq[i]] = i;
		qp[pq[j]] = j;
	}
	
	private void swim(int k) {
		while(k > 1 && greater(k/2, k)) {
			exch(k, k/2);
			k = k/2;
		}
	}
	
	private void sink(int k) {
		while(2*k <= N) {
			int j = 2*k;
			if(j < N && greater(j, j+1)) j++;
			if(!greater(k,j)) break;
			exch(k,j);
			k = j;
		}
	}
	
	
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void decreaseKey(int i, Key key) {
		
		if(i < 0 || i >= maxN) 			{ throw new IndexOutOfBoundsException(); }
		if(!contains(i)) 				{ throw new NoSuchElementException("index is not in the priority queue"); }
		if(keys[i].compareTo(key) <= 0) { throw new IllegalArgumentException("Calling decreaseKey() with given argument would not strictly decrease the key"); }
		
		keys[i] = key;
		swim(qp[i]);
		
	}

	
	
}
