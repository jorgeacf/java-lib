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

    @Override
    public String toString() {
        SingleLinkedNode curr = this;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            if(sb.length() != 0) { sb.append(", "); }
            sb.append(curr.getValue());
            curr = curr.getNext();
        }
        sb.insert(0, "[");
        sb.insert(sb.length(), "]");
        return sb.toString();
    }
}
