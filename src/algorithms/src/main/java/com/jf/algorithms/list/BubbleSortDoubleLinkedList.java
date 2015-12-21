package com.jf.algorithms.list;

import com.jf.structures.list.DoubleLinkedNode;

public final class BubbleSortDoubleLinkedList {

    private BubbleSortDoubleLinkedList() { }

    public static <T extends Comparable<T>> void sort(DoubleLinkedNode<T> first) {

        DoubleLinkedNode<T> sorted = last(first);

        while (sorted != first) {

            DoubleLinkedNode<T> max = new DoubleLinkedNode(Integer.MIN_VALUE);
            DoubleLinkedNode<T> curr = first;
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

    private static DoubleLinkedNode last(DoubleLinkedNode first) {

        DoubleLinkedNode curr = first;

        while(curr != null && curr.getNext() != null) {
            curr = curr.getNext();
        }

        return curr;
    }

}
