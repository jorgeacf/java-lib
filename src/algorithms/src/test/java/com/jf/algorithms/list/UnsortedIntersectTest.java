package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class UnsortedIntersectTest extends TestCase {

    public void testWithSmallLists() {

        SingleLinkedNode<Integer> listA = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 10, 7, 2, 5, 4, 1 });
        SingleLinkedNode<Integer> listB = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 9, 8, 7, 5, 3, 10 });

        SingleLinkedNode<Integer> result = UnsortedIntersect.intersect(listA, listB);

        assertTrue(Arrays.equals(new Integer[] {1, 7, 5, 10 }, SingleLinkedListUtils.toArray(result)));

    }

}
