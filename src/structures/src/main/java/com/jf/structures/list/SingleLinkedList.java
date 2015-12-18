package com.jf.structures.list;

import com.jf.utils.CheckUtils;

import java.util.Iterator;

public class SingleLinkedList<T> implements Iterable<T> {

    private SingleLinkedNode<T> first;
    private int size;

    public SingleLinkedList() { }

    public int size() { return size; }
    public boolean isEmpty() { return first == null; }

    public Class<?> getListItemType() { return first != null ? first.getValue().getClass() : null; }

    public void addFirst(T value) {

        CheckUtils.isNull(value, "value");

        SingleLinkedNode node = new SingleLinkedNode(value);

        if(first != null) {
            node.setNext(first);
        }

        first = node;

        size++;
    }

    public void addLast(T value) {

        CheckUtils.isNull(value, "value");

        SingleLinkedNode cursor = first;

        while(cursor.hasNext()) {
            cursor = cursor.getNext();
        }

        SingleLinkedNode node = new SingleLinkedNode(value);

        cursor.setNext(node);

        size++;
    }

    public void insertAtIndex(T value, int index) {

        CheckUtils.isNull(value, "value");
        if(index < 0 || index > size) { throw new IndexOutOfBoundsException("The index needs to be between 0 and the size of the list"); }

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

        if(isEmpty()) { throw new IndexOutOfBoundsException("Can't remove an item from a empty list."); }

        SingleLinkedNode<T> node = first;

        first = first.getNext();

        size--;

        return node.getValue();
    }

    public T removeLast() {

        if(isEmpty()) { throw new IndexOutOfBoundsException("Can't remove an item from a empty list."); }

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

        if(index > size) { throw new IllegalArgumentException("The index should be smaller than the size of the list."); }

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

    private class SingleLinkedListIterator<T> implements Iterator<T> {

        private SingleLinkedNode<T> cursor;

        public SingleLinkedListIterator(SingleLinkedNode<T> first) {
            cursor = first;
        }

        public boolean hasNext() {
            if(cursor == null) { return false; }
            return cursor.hasNext();
        }

        public T next() {

            T value = null;

            if(cursor != null) { value = cursor.getValue(); }
            if(cursor != null && cursor.hasNext()) { cursor = cursor.getNext(); }

            return value;
        }

    }

}
