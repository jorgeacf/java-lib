package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;

import java.util.HashSet;
import java.util.Set;

public final class UnsortedIntersect {

    private UnsortedIntersect() { }

    public static <T extends Comparable<T>>SingleLinkedNode<T> intersect(SingleLinkedNode<T> listA, SingleLinkedNode<T> listB) {

        Set<T> map = new HashSet<T>();

        SingleLinkedNode<T> curr = listA;

        while(curr != null) {

            map.add(curr.getValue());
            curr = curr.getNext();
        }

        SingleLinkedNode<T> result = new SingleLinkedNode<T>((T)new Integer(0));
        SingleLinkedNode<T> last = result;

        curr = listB;

        while (curr != null) {

            if(map.contains(curr.getValue())) {
                SingleLinkedNode<T> n = new SingleLinkedNode<T>(curr.getValue());
                last.setNext(n);
                last = last.getNext();
            }
            curr = curr.getNext();
        }

        return result.getNext();
    }

}
