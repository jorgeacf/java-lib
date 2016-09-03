package com.jf.structures.list;

import com.jf.utils.CheckUtils;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T extends Comparable<T>> implements Iterable<T> {

	private SingleLinkedNode<T> first;
	private int size = 0;

	public Stack() {
		first = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
	public void push(T item) {

		CheckUtils.isNull(item, "value");

		SingleLinkedNode<T> oldfirst = first;
		first = new SingleLinkedNode(item);
		first.setValue(item);
		first.setNext(oldfirst);
		size++;
	}
	
	public T pop() {
		if(isEmpty()) { throw new IndexOutOfBoundsException("Stack empty"); }
		T item = first.getValue();
		first = first.getNext();
		size--;
		return item;	
	}
	
	public T peek() {
		if(isEmpty()) { throw new IndexOutOfBoundsException("Stack empty"); }
		return first.getValue();
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

	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<T> {

		private SingleLinkedNode<T> current = first;
		
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if(!hasNext()) { throw new NoSuchElementException(); }
			T item = current.getValue();
			current = current.getNext();
			return item;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
}
