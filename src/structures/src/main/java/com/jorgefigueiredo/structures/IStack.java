package com.jorgefigueiredo.structures;

public interface IStack<T> {

	boolean isEmpty();

	int size();

	void push(T item);

	T pop();

	T peek();

}