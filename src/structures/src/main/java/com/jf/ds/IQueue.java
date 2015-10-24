package com.jf.ds;

public interface IQueue<T> {

	boolean isEmpty();

	int size();

	int length();

	void enqueue(T item);

	T dequeue();

}