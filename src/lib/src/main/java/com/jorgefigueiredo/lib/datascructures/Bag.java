package com.jorgefigueiredo.lib.datascructures;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class Bag<T> implements Iterable<T> {

	private int N;
	private Node<T> first;
	
	private static class Node<T> {
		
		private T item;
		private Node<T> next;
	}
	
	public Bag() {
		first = null;
		N = 0;
	}
	
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	
	public void add(T item) {
		
		Node<T> oldFirst = first;
		first = new Node<T>();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Iterator<T> iterator() {
		
		return new BagIterator<T>(first);
	}
	
	@SuppressWarnings("hiding")
	private class BagIterator<T> implements Iterator<T> {
		
		private Node<T> current;
		
		public BagIterator(Node<T> firstNode) {
			current = firstNode;
		}
		
		public boolean hasNext() { return current != null; }
		public void remove() { throw new UnsupportedOperationException(); }
		
		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
}
