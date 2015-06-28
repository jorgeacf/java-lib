package com.jorgefigueiredo.lib.algorithms;

import com.jorgefigueiredo.lib.datascructures.Stack;

import junit.framework.TestCase;

public class StackTests extends TestCase {


	public void testStackWith1Elements() {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(1);
		
		assertEquals(1, (int)stack.remove());
		
	}
	
	public void testStackWith3Elements() {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		
		assertEquals(3, (int)stack.remove());
		assertEquals(2, (int)stack.remove());
		assertEquals(1, (int)stack.remove());
		
	}
	
	public void testRemoveFromEmptyStack() {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		assertNull(stack.remove());
		
	}
	
}
