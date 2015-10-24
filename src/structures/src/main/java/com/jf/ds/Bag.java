package com.jf.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {

	private int N;
	private Node<Item> first;
	
	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}
	
	public Bag() {
		first = null;
		N = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void add(Item item) {
		Node<Item> oldfirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Iterator<Item> iterator() {
		
		return new ListIterator<Item>(first);
	}

	
	private class ListIterator<T> implements Iterator<T> {
		private Node<T> current;
		
		public ListIterator(Node<T> first) {
			current = first;
		}
		
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T item = current.item;
			current = current.next;
			return item;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
}
