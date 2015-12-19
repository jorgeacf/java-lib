package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedList;
import com.jf.structures.list.SingleLinkedNode;
import com.jf.utils.CheckUtils;

import java.util.Iterator;

public class SingleLinkedListUtils {


    private SingleLinkedListUtils() {}

    public static <T extends Comparable<T>> SingleLinkedList<T> makeListFromArray(T[] input) {

        SingleLinkedList<T> list = new SingleLinkedList<T>();

        int len = input.length;
        for(int i = len - 1; i >= 0; i--) {
            list.addFirst(input[i]);
        }

        return list;
    }

    public static <T extends Comparable<T>> SingleLinkedNode<T> makeNodeFromArray(T[] input) {

        SingleLinkedNode<T> dummy = new SingleLinkedNode<T>(null);

        SingleLinkedNode<T> last = dummy;

        int len = input.length;
        for(int i = 0; i < len; i++) {

            SingleLinkedNode<T> node = new SingleLinkedNode<T>(input[i]);
            last.setNext(node);
            last = last.getNext();
        }

        return dummy.getNext();
    }

    public static <T extends Comparable<T>> T[] toArray(SingleLinkedList<T> list) {

        CheckUtils.isNull(list, "list");

        if(list.isEmpty()) { return (T[])new Object[0]; }

        T[] result = (T[])java.lang.reflect.Array.newInstance(list.getListItemType(), list.size());

        Iterator<T> iterator = list.iterator();
        for(int i = 0; i < list.size() && !list.isEmpty(); i++) {
            result[i] = iterator.next();
        }

        return result;
    }

    public static <T extends Comparable<T>> T[] toArray(SingleLinkedNode<T> node) {

        CheckUtils.isNull(node, "node");

        int size = 0;
        SingleLinkedNode<T> current = node;
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
