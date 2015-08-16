package com.jorgefigueiredo.datastructures.tree;

public class Tree<Key extends Comparable<Key>, Value> {

	private Node root;
	
	
	private class Node {
		private Key key;
		private Value value;
		private Node left;
		private Node right;
		private int N;
		
		public Node(Key key, Value value, int N) {
			this.key = key;
			this.value = value;
			this.N = N;
		}
	}
	
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node x) {
		if(x == null) { return 0; }
		else { return x.N; }
	}
	
	public boolean contains(Key key) {
		return get(key) != null;
	}
	
	public Value get(Key key) {
		return get(root, key);
	}
	
	private Value get(Node x, Key key) {
		if(x == null) { return null; }
		int cmp = key.compareTo(x.key);
		if 		(cmp < 0) { return get(x.left, key); }
		else if (cmp > 0) { return get(x.right, key); }
		else { return x.value; }
	}
	
	
	public void put(Key key, Value value) {
		
		root = put(root, key, value);
		
	}
	
	public Node put(Node x, Key key, Value value) {
		if(x == null) { return new Node(key, value, 1); }
		int cmp = key.compareTo(x.key);
		if 		(cmp < 0) { x.left = put(x.left, key, value); }
		else if (cmp > 0) { x.right = put(x.right, key, value); }
		else 			  { x.value = value; }
		x.N = 1 + size(x.right) + size(x.left);
		return x;
	}
	
	
}
