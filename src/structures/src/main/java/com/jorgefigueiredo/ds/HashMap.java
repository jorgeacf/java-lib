package com.jorgefigueiredo.ds;

import java.util.LinkedList;


public class HashMap<K,V> implements IMap<K, V> {

	private LinkedList<HashEntry<K,V>>[] map = null;

	private int size = 128;
	
	@SuppressWarnings("unchecked")
	public HashMap() {
		
		map = new LinkedList[size];
		
		for(int i = 0; i < map.length; i++) {
			map[i] = new LinkedList<HashEntry<K,V>>();
		}
		
	}

	public V get(K key) {
		
		int hash = key.hashCode() % size;
		
		for(int i = 0; i < map[hash].size();i++) {
			HashEntry<K,V> item = map[hash].get(i);
			if(item.getKey().equals(key)) {
				return item.getValue(); 
			}
		}
		
		return null;
	}
	
	public void put(K key, V value) {
		
		int hash = key.hashCode() % size;
		
		map[hash].add(new HashEntry<K,V>(key, value));
		
	}
	
	public void remove(K key) {
		
		int hash = key.hashCode() % size;
		
		for(int i = 0; i < map[hash].size();i++) {
			HashEntry<K,V> item = map[hash].get(i);
			if(item.getKey().equals(key)) {
				map[hash].remove(i);
				break;
			}
		}
	}

	
	private class HashEntry<Key, Value> {
		
		private K key;
		private V value;
		
		public HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
	}
	
}
