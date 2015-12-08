package com.jf.stuctures.concurrent;

public class Queue<T> {

	private final Object lock = new Object();
	private Node<T> first;
	
	public boolean isEmpty() {
		
		return false;
	}

	public int size() {
		return 0;
	}

	public int length() {
		return 0;
	}

	public void enqueue(Object item) {
		
	}

	public T dequeue() {
		return null;
	}

	
	private static class Node<T> {
		public T value;
		public Node next;
	}
	
}
