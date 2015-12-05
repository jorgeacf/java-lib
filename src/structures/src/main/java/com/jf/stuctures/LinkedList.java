package com.jf.stuctures;


public class LinkedList<T> implements ILinkedList<T> {

	private int size;
	private Node first;
	private Node last;
	
	private class Node {
		private T value;
		private Node prev;
		private Node next;
	}
	
	public LinkedList() {
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(T item) {
		
		Node n = new Node();
		n.value = item;
		
		if(isEmpty()) {
			first = n;
			last = n;
		}
		else {
			n.next = first;
			first.prev = n;
			first = n;
		}
		size++;
	}
	
	public void addLast(T item) {
		
		Node n = new Node();
		n.value = item;
		
		if(isEmpty()) {
			first = n;
			last = n;
		}
		else {
			n.prev = last;
			n.prev.next = n;
			last = n;
		}
		size++;
	}
	
	public T removeFirst() {
		return null;
	}
	
	public T removeLast() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		
		if(isEmpty()) { return (T[]) new Object[0]; }
		
		Object[] array = new Object[size];
		
		int index = 0;
		Node current = first;
		while(current != null) {
			array[index] = current.value;
			current = current.next;
			index++;
		}
		
		return (T[])array;
	}
	
}
