package com.jf.algorithms.list;

import com.jf.structures.list.ValueDoubleLinkedNode;
import com.jf.utils.CheckUtils;

public final class DoubleLinkedListUtils {

    private DoubleLinkedListUtils() { }

    public static <T extends Comparable<T>> ValueDoubleLinkedNode<T> makeNodeFromArray(T[] input) {

        ValueDoubleLinkedNode<T> dummy = new ValueDoubleLinkedNode<T>(null);

        ValueDoubleLinkedNode<T> last = dummy;

        int len = input.length;
        for(int i = 0; i < len; i++) {

            ValueDoubleLinkedNode<T> node = new ValueDoubleLinkedNode<T>(input[i]);
            last.setNext(node);
            node.setPrevious(last);
            last = last.getNext();
        }

        dummy.getNext().setPrevious(null);

        return dummy.getNext();
    }

    public static <T extends Comparable<T>> T[] toArray(ValueDoubleLinkedNode<T> node) {

        CheckUtils.isNull(node, "node");

        int size = 0;
        ValueDoubleLinkedNode<T> current = node;
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
