package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;

public final class SortedIntersect {

    private SortedIntersect() { }

    public static <T extends Comparable<T>> SingleLinkedNode<T> intersect(SingleLinkedNode<T> listA, SingleLinkedNode<T> listB) {

        SingleLinkedNode<T> result = new SingleLinkedNode<T>((T)new Integer(0));
        SingleLinkedNode<T> last = result;

        SingleLinkedNode<T> cA = listA;
        SingleLinkedNode<T> cB = listB;

        while(cA != null && cB != null) {

            if(cA.getValue().compareTo(cB.getValue()) == 0) {

                SingleLinkedNode<T> n = new SingleLinkedNode<T>(cA.getValue());
                last.setNext(n);
                last = last.getNext();
            }

            int cmp = cA.getValue().compareTo(cB.getValue());

            if(cmp < 0) {
                cA = cA.getNext();
            }
            else if(cmp > 0) {
                cB = cB.getNext();
            }
            else {
                cA = cA.getNext();
                cB = cB.getNext();
            }

        }

        return result.getNext();
    }

}
