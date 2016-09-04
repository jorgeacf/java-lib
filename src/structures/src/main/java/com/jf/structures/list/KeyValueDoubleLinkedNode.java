package com.jf.structures.list;

public class KeyValueDoubleLinkedNode<K,V> {

    private final K key;
    private final V value;
    private KeyValueDoubleLinkedNode prev;
    private KeyValueDoubleLinkedNode next;

    public KeyValueDoubleLinkedNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setPrev(KeyValueDoubleLinkedNode prev) {
        this.prev = prev;
    }

    public void setNext(KeyValueDoubleLinkedNode next) {
        this.next = next;
    }

    public KeyValueDoubleLinkedNode getPrev() {
        return this.prev;
    }

    public KeyValueDoubleLinkedNode getNext() {
        return this.next;
    }

    public V getValue() {
        return this.value;
    }

    public K getKey() {
        return this.key;
    }

}
