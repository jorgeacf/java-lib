package com.jf.stuctures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

	@Test(expected=RuntimeException.class)
	public void testEmptyStack() {
		
		IStack<Integer> stack = new Stack<Integer>();
	
		stack.pop();
		
	}

	@Test
	public void testThreeItems() {
		
		IStack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(1), stack.pop());
		
	}
	
}
