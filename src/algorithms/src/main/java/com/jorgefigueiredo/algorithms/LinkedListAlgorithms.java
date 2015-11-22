package com.jorgefigueiredo.algorithms;

import java.util.Iterator;

public final class LinkedListAlgorithms {


    public  static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);

        for(Integer i : list) {
            System.out.println(i);
        }

        list.delete(2);
        list.deleteIndex(0);
        list.deleteIndex(2);

        for(Integer i : list) {
            System.out.println("-" + i);
        }


        LinkedList<Comparable> list1 = new LinkedList<Comparable>();
        LinkedList<Comparable> list2 = new LinkedList<Comparable>();

        list1.insertFirst(9);
        list1.insertFirst(7);
        list1.insertFirst(5);

        list2.insertFirst(8);
        list2.insertFirst(6);
        list2.insertFirst(4);
        list2.insertFirst(2);

        Node<Comparable> result = mergeOrderLinkedLists(list1.getFirst(), list2.getFirst());

        print(result);

    }

    public static void print(Node first) {

        if(first == null) { return; }

        System.out.print(first.getValue() + " ");

        print(first.getNext());
    }

    public static <T extends Comparable> Node<T> mergeOrderLinkedLists(Node<T> list1, Node<T> list2) {

        Node dummy = new Node(0);

        Node current = dummy;

        while (list1 != null || list2 != null) {

            if (list1 == null && list2 != null) {
                Node temp = list2;
                list2 = list2.getNext();
                temp.setNext(null);
                current.setNext(temp);
            }
            else if (list1 != null && list2 == null) {
                Node temp = list1;
                list1 = list1.getNext();
                temp.setNext(null);
                current.setNext(temp);
            }
            else {
                if(list1.getValue().compareTo(list2.getValue()) < 0) {
                    Node temp = list1;
                    list1 = list1.getNext();
                    temp.setNext(null);
                    current.setNext(temp);
                }
                else {
                    Node temp = list2;
                    list2 = list2.getNext();
                    temp.setNext(null);
                    current.setNext(temp);

                }
            }
            current = current.getNext();
        }

        return dummy.getNext();
    }


    public static class LinkedList<T> implements Iterable<T> {

        private Node<T> first;

        public Node getFirst() {
            return first;
        }

        public void insertFirst(T value) {

            Node n = new Node(value);
            n.setNext(first);
            first = n;

        }

        public void insertAfter(Node prev, T value) {

            if(prev == null) { throw new IllegalArgumentException(); }

            Node n = new Node(value);
            prev.setNext(n);
            prev = n;
        }

        public void insertLast(T value) {

            Node n = new Node(value);

            if(first == null) {
                first = n;
            }
            else {
                Node current = first;
                while(current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(n);
            }

        }

        public void deleteIndex(int index) {

            int i = 0;
            Node temp = first;
            Node prev = first;

            while(temp != null) {

                if(i == index) {

                    if(first != temp) {
                        prev.setNext(temp.getNext());
                    }
                    else {
                        first = temp.getNext();
                    }
                    return;
                }
                i++;
                prev = temp;
                temp = temp.getNext();
            }

        }

        public void delete(T value) {

            Node temp = first;
            Node prev = first;

            while(temp != null) {

                if(temp.getValue().equals(value)) {

                    if(first != temp) {
                        prev.setNext(temp.getNext());
                    }
                    else {
                        first = temp.getNext();
                    }
                }

                prev = temp;
                temp = temp.getNext();
            }

        }


        public Iterator<T> iterator() {
            return new LinkedListIterator<T>(first);
        }

        private static class LinkedListIterator<T> implements Iterator<T>{

            private Node current;

            public LinkedListIterator(Node first) { this.current = first; }

            public boolean hasNext() {
                return current != null;
            }

            public T next() {

                if(!hasNext()) { throw new IllegalArgumentException(); }

                Node temp = current;
                current = current.next;
                return (T)temp.getValue();
            }

        }

    }

    public static class Node<T> {

        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public void setValue(T value) { this.value = value; }
        public void setNext(Node next) { this.next = next; }

        public T getValue() { return this.value; }
        public Node getNext() { return this.next; }

    }

}
