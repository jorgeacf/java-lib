package com.jorgefigueiredo.datastructures.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterable<T>, IQueue<T> {

	private Node first;
	private Node last;
	
	private int size;
	
	private class Node {
		private T value;
		private Node next;
	}
	
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
		Node n = new Node();
		n.value = item;
		if(isEmpty()){
			first = n;
			last = n;
		}
		else {
			last.next = n;
			last = n;
		}
		size++;
	}
	
	public T dequeue() {
		if(isEmpty()) { throw new RuntimeException("Queue empty"); }
		T item = first.value;
		first = first.next;
		size--;
		if(isEmpty()) { last = null; }
		return item;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(T item : this) {
			sb.append(item + " ");
		}
		return sb.toString();
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<T> {

		private Node current = first;
		
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if(!hasNext()) { throw new NoSuchElementException(); }
			T item = current.value;
			current = current.next;
			return item;
		}
		
	}
	
}
