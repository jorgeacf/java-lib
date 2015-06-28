package com.jorgefigueiredo.lib.datascructures;



public class Queue<T> {

	private Node<T> first = null;
	private Node<T> last = null;
	
	public void enqueue(T item) {
		
		Node<T> n = new Node<T>(item);
		if(first == null && last == null) {
			
			first = n;
			last = n;
		}
		else {
			
			last.setNext(n);
			last = n;
		}
	}
	
	public T dequeue() {
		Node<T> n = first;
		if(n == null) { return null; }
		first = n.getNext();	
		return n.getValue();
	}
}
