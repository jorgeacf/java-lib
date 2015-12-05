package com.jf.algorithms;

public class StockProfits {

	
	public static long calc(long[] values) {
		
		long profit = 0;
		
		for(int i = 0; i < values.length; i++) {
			
			for(int j = 0; j < values.length; j++) {
				
				int earlier_time = Math.min(i, j);
				int later_time = Math.max(i, j);
				
				long earlier_price = values[earlier_time];
				long later_price = values[later_time];
				
				long potential_profit = later_price - earlier_price;
				
				profit = Math.max(profit, potential_profit);
			}
		}
		
		
		return profit;
	}
	
}
