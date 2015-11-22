package com.jf.ds;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TopNListTest {

	@Test
	public void test() {
		
		TopNList<Integer> top = new TopNList<Integer>(5);
		
		top.add(1);
		top.add(2);
		
		top.add(3);
		top.add(4);
		top.add(5);
		top.add(7);
		top.add(6);
		
		Iterator<Integer> result = top.iterator();
		
		assertEquals(new Integer(3), result.next());
		assertEquals(new Integer(4), result.next());
		assertEquals(new Integer(5), result.next());
		assertEquals(new Integer(6), result.next());
		assertEquals(new Integer(7), result.next());
		assertFalse(result.hasNext());
		
	}

}
