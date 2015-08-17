package com.jorgefigueiredo.datastructures.list;

public interface IQueue<T> {

	boolean isEmpty();

	int size();

	int length();

	void enqueue(T item);

	T dequeue();

}