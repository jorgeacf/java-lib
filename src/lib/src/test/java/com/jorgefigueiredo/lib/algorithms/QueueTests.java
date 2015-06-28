package com.jorgefigueiredo.lib.algorithms;

import com.jorgefigueiredo.lib.datascructures.AppTest;
import com.jorgefigueiredo.lib.datascructures.Queue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QueueTests extends TestCase {

    public QueueTests( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
	
	public void testEnqueueOneItemAndDequeue() {
		
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(1);
		
		assertEquals(1, (int)queue.dequeue());
		
	}
	
	public void testEnqueueTwoItemsAndDequeue() {
		
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		
		assertEquals(1, (int)queue.dequeue());
		assertEquals(2, (int)queue.dequeue());
	}
	
	public void testDequeueOnEmptyQueue() {
		
		Queue<Integer> queue = new Queue<Integer>();
		
		assertNull(queue.dequeue());
		
	}
	
	
}
