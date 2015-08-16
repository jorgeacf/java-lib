package com.jorgefigueiredo.datastructures.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jorgefigueiredo.datastructures.list.Stack;

public class StackTests {

	@Test(expected=RuntimeException.class)
	public void testEmptyStack() {
		
		Stack<Integer> stack = new Stack<Integer>();
	
		stack.pop();
		
	}

	@Test
	public void testThreeItems() {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(1), stack.pop());
		
	}
	
}
