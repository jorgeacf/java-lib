package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;

public final class MergeOrderedLinkedLists {

    public static <T extends Comparable<T>> SingleLinkedNode<T> mergeSingleLinkedList(SingleLinkedNode<T> listA, SingleLinkedNode<T> listB) {

        SingleLinkedNode dummyNode = new SingleLinkedNode(-1);

        SingleLinkedNode current = dummyNode;

        while (listA != null || listB != null) {

            if(listA == null && listB != null) {

                current.setNext(listB);
                listB = listB.getNext();
            }
            else if(listA != null && listB == null) {

                current.setNext(listA);
                listA = listA.getNext();
            }
            else if(listA != null && listB != null) {

                if(listA.getValue().compareTo(listB.getValue()) > 0) {

                    SingleLinkedNode<T> n = listB;
                    listB = listB.getNext();
                    n.setNext(null);
                    current.setNext(n);
                }
                else if (listA.getValue().compareTo(listB.getValue()) < 0) {

                    current.setNext(listA);
                    listA = listA.getNext();
                    current.getNext().setNext(null);
                }
            }
            current = current.getNext();
        }

        return dummyNode.getNext();
    }

}
