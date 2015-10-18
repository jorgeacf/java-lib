package com.jorgefigueiredo.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockProfitsTests {

	@Test
	public void test() {
		
		long[] values = new long[] { 3, 4, 5, 6, 5, 6, 7, 8, 9, 8, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10  };
		
		long result = StockProfits.calc(values);
		
		assertEquals(10, result);
	}

}
