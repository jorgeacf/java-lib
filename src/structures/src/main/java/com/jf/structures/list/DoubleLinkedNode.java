package com.jf.structures.list;

public class DoubleLinkedNode<T> extends SingleLinkedNode<T> {

    private Node previous;

    public DoubleLinkedNode(T value) {
        super(value);
        setNext(null);
        setPrevious(null);
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
