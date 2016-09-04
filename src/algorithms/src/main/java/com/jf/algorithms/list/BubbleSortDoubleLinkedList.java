package com.jf.algorithms.list;

import com.jf.structures.list.ValueDoubleLinkedNode;

public final class BubbleSortDoubleLinkedList {

    private BubbleSortDoubleLinkedList() { }

    public static <T extends Comparable<T>> void sort(ValueDoubleLinkedNode<T> first) {

        ValueDoubleLinkedNode<T> sorted = last(first);

        while (sorted != first) {

            ValueDoubleLinkedNode<T> max = new ValueDoubleLinkedNode(Integer.MIN_VALUE);
            ValueDoubleLinkedNode<T> curr = first;
            while(curr != sorted) {
                if(curr.getValue().compareTo(max.getValue()) > 0) { max = curr; }
                curr = curr.getNext();
            }

            if(max.getValue().compareTo(sorted.getValue()) > 0) {
                T tmp = max.getValue();
                max.setValue(sorted.getValue());
                sorted.setValue(tmp);
            }
            sorted = sorted.getPrevious();
        }
    }

    private static ValueDoubleLinkedNode last(ValueDoubleLinkedNode first) {

        ValueDoubleLinkedNode curr = first;

        while(curr != null && curr.getNext() != null) {
            curr = curr.getNext();
        }

        return curr;
    }

}
