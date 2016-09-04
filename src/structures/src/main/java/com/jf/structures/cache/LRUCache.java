package com.jf.structures.cache;

import com.jf.structures.list.KeyValueDoubleLinkedNode;
import com.jf.utils.CheckUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache<K,V> {

    private final int capacity;
    private HashMap<K,KeyValueDoubleLinkedNode<K, V>> map = new HashMap<K, KeyValueDoubleLinkedNode<K, V>>();
    private KeyValueDoubleLinkedNode<K, V> head;
    private KeyValueDoubleLinkedNode<K, V> tail;
    private int size = 0;

    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public V get(K key) {
        CheckUtils.isNull(key, "key");
        if(map.containsKey(key)) {
            KeyValueDoubleLinkedNode<K, V> node = map.get(key);
            if(node.getPrev() != null) {
                node.getPrev().setNext(node.getNext());
            }
            if(node.getNext() != null) {
                node.getNext().setPrev(node.getPrev());
            }
            node.setNext(head);
            head = node;
            return node.getValue();
        }
        return null;
    }

    public void set(K key, V value) {
        CheckUtils.isNull(key, "key");
        CheckUtils.isNull(value, "value");
        KeyValueDoubleLinkedNode<K,V> node = new KeyValueDoubleLinkedNode<K, V>(key, value);
        if(size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }
        else if(size >= capacity) {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        map.put(key, node);
        node.setNext(head);
        head.setPrev(node);
        head = node;
        size++;
    }

    public List<V> getCachedItems() {
        List<V> items = new LinkedList<V>();
        KeyValueDoubleLinkedNode<K,V> current = head;
        while(current != null) {
            items.add(current.getValue());
            current = current.getNext();
        }
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        KeyValueDoubleLinkedNode current = head;
        while(current != null) {
            if(sb.length()!=0) {
                sb.append(", ");
            }
            sb.append(String.format("([%s]-%s)", current.getKey(), current.getValue()));
            current = current.getNext();
        }
        return sb.toString();
    }

}
