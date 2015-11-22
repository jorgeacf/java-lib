package com.jf.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

	@Test(expected=RuntimeException.class)
	public void testEmptyQueue() {
		
		IQueue<Integer> queue = new Queue<Integer>();
	
		queue.dequeue();
		
	}
	
	@Test
	public void testRemoveThreeItems() {
	
		IQueue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		assertEquals(new Integer(1), queue.dequeue());
		assertEquals(new Integer(2), queue.dequeue());
		assertEquals(new Integer(3), queue.dequeue());
		
	}

}
