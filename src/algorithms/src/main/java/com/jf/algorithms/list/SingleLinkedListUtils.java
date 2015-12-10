package com.jf.algorithms.list;

import com.jf.algorithms.utils.CheckUtils;
import com.jf.structures.list.SingleLinkedList;

import java.util.Iterator;

public class SingleLinkedListUtils {


    private SingleLinkedListUtils() {}

    public static <T> SingleLinkedList<T> makeFromArray(T[] input) {

        SingleLinkedList<T> list = new SingleLinkedList<T>();

        int len = input.length;
        for(int i = len - 1; i >= 0; i--) {
            list.addFirst(input[i]);
        }

        return list;
    }

    public static <T> T[] toArray(SingleLinkedList<T> list) {

        CheckUtils.isNull(list, "list");

        if(list.isEmpty()) { return (T[])new Object[0]; }

        T[] result = (T[])java.lang.reflect.Array.newInstance(list.getListItemType(), list.size());

        Iterator<T> iterator = list.iterator();
        for(int i = 0; i < list.size() && !list.isEmpty(); i++) {
            result[i] = iterator.next();
        }

        return result;
    }

}
