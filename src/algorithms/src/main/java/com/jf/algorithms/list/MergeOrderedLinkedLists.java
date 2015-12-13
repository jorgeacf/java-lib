package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;

public final class MergeOrderedLinkedLists {

    public static SingleLinkedNode mergeSingleLinkedList(SingleLinkedNode listA, SingleLinkedNode listB) {

        SingleLinkedNode dummyNode = new SingleLinkedNode(-1);

        while (listA != null || listB != null) {


            if(listA == null && listB != null) {

            }
            else if(listA != null && listB == null) {

            }
            else if(listA != null && listB != null) {

            }

        }

        return dummyNode.getNext();
    }

}
