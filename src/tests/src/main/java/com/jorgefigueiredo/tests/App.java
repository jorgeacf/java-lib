package com.jorgefigueiredo.tests;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Integer[] items = new Integer[] { 1, 2, 3, 4 ,5 ,6 ,7, 8, 9  };
    	
    	MyList<Integer> list = new MyList<Integer>(items);
    	
    	Iterator<Integer> itr = list.iterator();
    	
    	while(itr.hasNext()) {
    		System.out.print(itr.next());
    	}

    	while(itr.hasNext()) {
    		System.out.print(itr.next());
    	}
    	
    }
    
    
    public static class MyList<T> implements Iterable<T> {

    	private T[] items;
    	
    	public MyList(T[] items) {
    		this.items = items;
    	}
    	
		public Iterator<T> iterator() {
			return new Iterator<T>() {

				int index = 0;
				
				public boolean hasNext() {
					
					return index < items.length;
				}

				public T next() {
					T item = items[index];
					index++;
					return item;
				}
				
			};
		}
    	
    	
    	
    }
    
    
}
