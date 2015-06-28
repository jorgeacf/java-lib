package com.jorgefigueiredo.lib.datascructures;


public class Stack<T> {

	private Node<T> first = null;
	
	public void add(T item) {
		
		Node<T> node = new Node<T>(item);
		node.setNext(first);
		first = node;
	}
	
	public T remove() {
		
		Node<T> node = first;
		if(node == null) { return null; };
		first = node.getNext();
		return node.getValue();
	}
	
}
