package com.jf.structures.list;

public class ValueDoubleLinkedNode<T> extends Node<T>  {

    private ValueDoubleLinkedNode previous;
    private ValueDoubleLinkedNode next;

    public ValueDoubleLinkedNode(T value) {
        super(value);
        setNext(null);
        setPrevious(null);
    }

    public ValueDoubleLinkedNode getPrevious() {
        return previous;
    }
    public ValueDoubleLinkedNode getNext() { return next; }

    public void setPrevious(ValueDoubleLinkedNode previous) {
        this.previous = previous;
    }
    public void setNext(ValueDoubleLinkedNode next) { this.next = next; }

    @Override
    public String toString() {
        ValueDoubleLinkedNode curr = this;
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
