package com.jorgefigueiredo.datastructures.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T>, IStack<T> {

	private Node first;
	private int size = 0;
	
	private class Node {
		private T value;
		private Node next;
	}
	
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
		
		Node oldfirst = first;
		first = new Node();
		first.value = item;
		first.next = oldfirst;
		size++;
	}
	
	public T pop() {
		if(isEmpty()) { throw new RuntimeException("Stack empy"); }
		T item = first.value;
		first = first.next;
		size--;
		return item;	
	}
	
	public T peek() {
		if(isEmpty()) { throw new RuntimeException("Stack empy"); }
		return first.value;
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
