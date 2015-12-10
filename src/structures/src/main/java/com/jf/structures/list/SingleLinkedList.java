package com.jf.structures.list;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;
import java.util.function.Consumer;

public class SingleLinkedList<T> implements Iterable<T> {

    private SingleLinkedNode<T> first;
    private int size;

    public SingleLinkedList() { }

    public int size() { return size; }
    public boolean isEmpty() { return first == null; }

    public Class<?> getListItemType() { return first != null ? first.getValue().getClass() : null; }

    public void addFirst(T value) {

        SingleLinkedNode node = new SingleLinkedNode(value);

        if(first != null) {
            node.setNext(first);
        }

        first = node;

        size++;
    }

    public void addLast(T value) {

        SingleLinkedNode cursor = first;

        while(cursor.hasNext()) {
            cursor = cursor.getNext();
        }

        SingleLinkedNode node = new SingleLinkedNode(value);

        cursor.setNext(node);

        size++;
    }

    public void insertAtIndex(T value, int index) {

        SingleLinkedNode cursor = first;
        SingleLinkedNode prev = null;

        int i = 0;
        while(cursor.hasNext() && i < index) {
            prev = cursor;
            cursor = cursor.getNext();
            i++;
        }

        SingleLinkedNode node = new SingleLinkedNode(value);
        node.setNext(cursor);
        prev.setNext(node);

        size++;
    }

    public T removeFirst() {

        SingleLinkedNode<T> node = first;

        first = first.getNext();

        size--;

        return node.getValue();
    }

    public T removeLast() {

        SingleLinkedNode<T> cursor = first;
        SingleLinkedNode<T> prev = null;

        while(cursor.hasNext()) {
            prev = cursor;
            cursor = cursor.getNext();
        }

        prev.setNext(null);

        size--;

        return cursor.getValue();
    }

    public T removeAtIndex(int index) {

        SingleLinkedNode<T> cursor = first;
        SingleLinkedNode<T> prev = null;

        int i = 0;
        while(cursor.hasNext() && i < index) {
            prev = cursor;
            cursor = cursor.getNext();
            i++;
        }

        prev.setNext(cursor.getNext());

        size--;

        return cursor.getValue();
    }

    public Iterator<T> iterator() {
        return new SingleLinkedListIterator<T>(first);
    }

    private static class SingleLinkedListIterator<TT> implements Iterator<TT> {

        private SingleLinkedNode<TT> cursor;

        public SingleLinkedListIterator(SingleLinkedNode<TT> first) {
            cursor = first;
        }

        public boolean hasNext() {
            if(cursor == null) { return false; }
            return cursor.hasNext();
        }

        public TT next() {

            TT value = null;

            if(cursor != null) { value = cursor.getValue(); }
            if(cursor != null && cursor.hasNext()) { cursor = cursor.getNext(); }

            return value;
        }

        public void remove() {
            throw new NotImplementedException();
        }

        public void forEachRemaining(Consumer<? super TT> action) {
            throw new NotImplementedException();
        }
    }

}
