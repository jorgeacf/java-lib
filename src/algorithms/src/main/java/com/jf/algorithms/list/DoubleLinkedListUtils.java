package com.jf.algorithms.list;

import com.jf.structures.list.DoubleLinkedNode;
import com.jf.utils.CheckUtils;

public final class DoubleLinkedListUtils {

    private DoubleLinkedListUtils() { }

    public static <T extends Comparable<T>> DoubleLinkedNode<T> makeNodeFromArray(T[] input) {

        DoubleLinkedNode<T> dummy = new DoubleLinkedNode<T>(null);

        DoubleLinkedNode<T> last = dummy;

        int len = input.length;
        for(int i = 0; i < len; i++) {

            DoubleLinkedNode<T> node = new DoubleLinkedNode<T>(input[i]);
            last.setNext(node);
            node.setPrevious(last);
            last = last.getNext();
        }

        dummy.getNext().setPrevious(null);

        return dummy.getNext();
    }

    public static <T extends Comparable<T>> T[] toArray(DoubleLinkedNode<T> node) {

        CheckUtils.isNull(node, "node");

        int size = 0;
        DoubleLinkedNode<T> current = node;
        while(current != null) {
            current = current.getNext();
            size++;
        }

        T[] result = (T[])java.lang.reflect.Array.newInstance(node.getValue().getClass(), size);

        current = node;
        int i = 0;
        while(current != null) {
            result[i] = current.getValue();
            current = current.getNext();
            i++;
        }

        return result;
    }

}
