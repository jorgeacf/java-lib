package com.jf.algorithms.graphs;

import org.junit.Test;

public class IndexedPriorityQueueTest {

	@Test
	public void testDesc() {
		
		Integer[] input = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		IndexedPriorityQueue<Integer> pq = new IndexedPriorityQueue<Integer>(input.length);
		
		for(int i = 0; i < input.length; i++) {
			pq.insert(i, input[i]);
		}
		
		while(!pq.isEmpty()) {
			int i = pq.delMin();
			
			//System.out.println(i + " " + input[i]);
		}
	}

	@Test
	public void testAsc() {
		
		Integer[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		IndexedPriorityQueue<Integer> pq = new IndexedPriorityQueue<Integer>(input.length);
		
		for(int i = 0; i < input.length; i++) {
			pq.insert(i, input[i]);
		}
		
		while(!pq.isEmpty()) {
			int i = pq.delMin();
			
			//System.out.println(i + " " + input[i]);
		}
	}
	
}
