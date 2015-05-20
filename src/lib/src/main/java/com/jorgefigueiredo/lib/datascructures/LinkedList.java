package com.jorgefigueiredo.lib.datascructures;

public class LinkedList<T> {

	private Node<T> first;

	
	public T getFirstValue() {
		
		if(first == null) { return null; }
		
		return first.getValue();
	}
	
	public Node<T> getFirstNode() {
		
		if(first == null) { return null; }
		
		return first;
	}
	
	public void addValue(T value) {
		Node<T> n = new Node<T>(value);
		n.setNext(first);
		first = n;
	}
	
	public void addNode(Node<T> node) {
		node.setNext(first);
		first = node;
	}
	
	public T removeFirstValue() {
	
		Node<T> n = removeFirstNode();
		
		if(first == null) { return null; }
		
		return n.getValue();
	}
	
	public Node<T> removeFirstNode() {
		
		if(first == null) { return null; }
		
		Node<T> n = first;
		first = n.getNext();
		return n;
	}
	
}
