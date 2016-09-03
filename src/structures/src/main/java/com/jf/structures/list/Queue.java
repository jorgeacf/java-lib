package com.jf.structures.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterable<T> {

	private SingleLinkedNode<T> first;
	private SingleLinkedNode<T> last;
	
	private int size;

	public Queue() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
	public int length() {
		return size;
	}
	
	public void enqueue(T item) {
		SingleLinkedNode n = new SingleLinkedNode(item);
		if(isEmpty()){
			first = n;
			last = n;
		}
		else {
			last.setNext(n);
			last = n;
		}
		size++;
	}
	
	public T dequeue() {
		if(isEmpty()) { throw new RuntimeException("Queue empty"); }
		T item = first.getValue();
		first = first.getNext();
		size--;
		if(isEmpty()) { last = null; }
		return item;
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
