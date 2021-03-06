package com.jf.structures.list;

import com.jf.utils.CheckUtils;

import java.util.Iterator;
import java.util.TreeSet;

public class TopNList<E extends Comparable<?>> {

	private final int size;
	private TreeSet<E> set;
	
	public TopNList(int size) {
		this.size = size;
		this.set = new TreeSet<E>();
	}
	
	public void add(E item) {

		CheckUtils.isNull(item, "item");
		set.add(item);
		if(set.size() > size) {
			set.remove(set.first());
		}
	}
	
	public Iterator<E> iterator() {
		return set.iterator();
	}
	
}
