package com.jf.structures.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {

	private int N;
	private SingleLinkedNode<T> first;
	
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
		SingleLinkedNode<T> oldFirst = first;
		first = new SingleLinkedNode<T>(t);
		first.setNext(oldFirst);
		N++;
	}
	
	public Iterator<T> iterator() {
		
		return new ListIterator<T>(first);
	}

	private class ListIterator<T> implements Iterator<T> {
		private SingleLinkedNode<T> current;
		
		public ListIterator(SingleLinkedNode<T> first) {
			current = first;
		}
		
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T item = current.getValue();
			current = current.getNext();
			return item;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
}
