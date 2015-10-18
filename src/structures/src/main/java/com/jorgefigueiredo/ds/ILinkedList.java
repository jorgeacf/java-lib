package com.jorgefigueiredo.ds;

public interface ILinkedList<T> {

	boolean isEmpty();

	int size();

	void addFirst(T item);

	void addLast(T item);

	T removeFirst();

	T removeLast();

}