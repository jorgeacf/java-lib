package com.jf.structures.list;

public class SingleLinkedNode<T> extends Node<T> {

    private SingleLinkedNode next;

    public SingleLinkedNode(T value) {
        super(value);
        this.setNext(null);
    }

    public SingleLinkedNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedNode next) {
        this.next = next;
    }

    public boolean hasNext() { return next != null; }

}
