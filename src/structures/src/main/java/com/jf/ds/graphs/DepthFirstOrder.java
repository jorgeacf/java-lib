package com.jf.ds.graphs;

import com.jf.ds.Queue;

import java.util.Stack;

public class DepthFirstOrder<E extends Edge> {

	private boolean[] marked;
	private int[] pre;
	private int[] post;
	private Queue<Integer> preorder;
	private Queue<Integer> postorder;
	private int preCounter;
	private int posCounter;
	
	public DepthFirstOrder(DirectedGraph<E> G) {
		pre = new int[G.V()];
		post = new int[G.V()];
		preorder = new Queue<Integer>();
		postorder = new Queue<Integer>();
		marked = new boolean[G.V()];
		
		for(int v = 0; v < G.V(); v++) {
			if(!marked[v]) { dfs(G, v); }
		}
	}
	
	private void dfs(DirectedGraph<E> G, int v) {
		marked[v] = true;
		pre[v] = preCounter++;
		preorder.enqueue(v);
		for(Edge e : G.adj(v)) {
			
			int w = e.to();
			if(!marked[w]) {
				dfs(G, w);
			}
		}
		postorder.enqueue(v);
		post[v] = posCounter++;
	}
	
	public int pre(int v) {
		return pre[v];
	}
	
	public int post(int v) {
		return post[v];
	}
	
	public Iterable<Integer> post() {
		return postorder;
	}
	
	public Iterable<Integer> pre() {
		return preorder;
	}
	
	public Iterable<Integer> reversePost() {
		Stack<Integer> reverse = new Stack<Integer>();
		for(int v : postorder) {
			reverse.push(v);
		}
		return reverse;
	}
}
