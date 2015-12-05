package com.jf.stuctures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {

	private int N;
	private Node<T> first;
	
	private static class Node<T> {
		private T t;
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
	
	public void add(T t) {
		Node<T> oldFirst = first;
		first = new Node<T>();
		first.t = t;
		first.next = oldFirst;
		N++;
	}
	
	public Iterator<T> iterator() {
		
		return new ListIterator<T>(first);
	}

	private class ListIterator<T> implements Iterator<T> {
		private Node<T> current;
		
		public ListIterator(Node<T> first) {
			current = first;
		}
		
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T item = current.t;
			current = current.next;
			return item;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
}
