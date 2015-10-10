package com.jorgefigueiredo.structures;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class BagTests {

	@Test
	public void test() {
		
		Bag<Integer> bag = new Bag<Integer>();
	
		bag.add(1);
		bag.add(2);
		bag.add(3);
		
		Iterator<Integer> iterator = bag.iterator();
		
		assertEquals(new Integer(3), iterator.next());
		assertEquals(new Integer(2), iterator.next());
		assertEquals(new Integer(1), iterator.next());
		
	}

}
