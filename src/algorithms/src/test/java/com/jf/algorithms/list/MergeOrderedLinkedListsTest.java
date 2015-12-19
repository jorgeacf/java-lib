package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class MergeOrderedLinkedListsTest extends TestCase {

    public void testMergeOrderedLists() {

        SingleLinkedNode listA = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 3, 5, 7, 9 });
        SingleLinkedNode listB = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 2, 4, 6, 8, 10 });

        SingleLinkedNode nodeResult = MergeOrderedLinkedLists.mergeSingleLinkedList(listA, listB);

        Integer[] result = (Integer[])SingleLinkedListUtils.toArray(nodeResult);

        assertTrue(Arrays.equals(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, result));
    }

}
