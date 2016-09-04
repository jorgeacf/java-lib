package com.jf.structures.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {

	private SingleLinkedNode<T> first;
	private int size;

	public Bag() {
		first = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
	public void add(T t) {
		SingleLinkedNode<T> oldFirst = first;
		first = new SingleLinkedNode<T>(t);
		first.setNext(oldFirst);
		size++;
	}
	
	public Iterator<T> iterator() {
		return new ListIterator<T>(first);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = first;
		while (current != null) {
			if(current != first) { sb.append(", "); }
			sb.append(current.getValue());
		}
		sb.insert(0, "[");
		sb.insert(sb.length(), "]");
		return sb.toString();
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
