package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class SortedIntersectTest extends TestCase {


    public void testWithListWithSameLength() {

        SingleLinkedNode<Integer> listA = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 2, 5, 7, 10 });
        SingleLinkedNode<Integer> listB = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 3, 5, 8, 10 });

        SingleLinkedNode<Integer> result = SortedIntersect.intersect(listA, listB);

        assertTrue(Arrays.equals(new Integer[] { 1, 5, 10 }, SingleLinkedListUtils.toArray(result)));

    }

    public void testWithListWithDifferentLength() {

        SingleLinkedNode<Integer> listA = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 2, 4, 5, 7, 10 });
        SingleLinkedNode<Integer> listB = SingleLinkedListUtils.makeNodeFromArray(new Integer[] { 1, 3, 5, 7, 8, 9, 10 });

        SingleLinkedNode<Integer> result = SortedIntersect.intersect(listA, listB);

        assertTrue(Arrays.equals(new Integer[] { 1, 5, 7, 10 }, SingleLinkedListUtils.toArray(result)));

    }

}
