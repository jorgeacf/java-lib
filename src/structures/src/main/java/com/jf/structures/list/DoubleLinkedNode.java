package com.jf.structures.list;

public class DoubleLinkedNode<T> extends Node<T>  {

    private DoubleLinkedNode previous;
    private DoubleLinkedNode next;

    public DoubleLinkedNode(T value) {
        super(value);
        setNext(null);
        setPrevious(null);
    }

    public DoubleLinkedNode getPrevious() {
        return previous;
    }
    public DoubleLinkedNode getNext() { return next; }

    public void setPrevious(DoubleLinkedNode previous) {
        this.previous = previous;
    }
    public void setNext(DoubleLinkedNode next) { this.next = next; }

    @Override
    public String toString() {

        DoubleLinkedNode curr = this;

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
