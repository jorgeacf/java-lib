package com.jf.algorithms.list;

import com.jf.structures.list.ValueDoubleLinkedNode;
import junit.framework.TestCase;

import java.util.Arrays;

public class BubbleSortDoubleLinkedListTest extends TestCase {

    public void test() {

        Integer[] input = new Integer[] { 7, 3, 9, 1, 2, 6, 4, 8, 5, 0 };
        ValueDoubleLinkedNode<Integer> list = DoubleLinkedListUtils.makeNodeFromArray(input);

        BubbleSortDoubleLinkedList.sort(list);

        Integer[] output = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] result = DoubleLinkedListUtils.toArray(list);

        assertTrue(Arrays.equals(output, result));
    }

    public void testOnlyTwoItemsOnTheList() {

        Integer[] input = new Integer[] { 1, 0 };
        ValueDoubleLinkedNode<Integer> list = DoubleLinkedListUtils.makeNodeFromArray(input);

        BubbleSortDoubleLinkedList.sort(list);

        Integer[] output = new Integer[] { 0, 1 };
        Integer[] result = DoubleLinkedListUtils.toArray(list);

        assertTrue(Arrays.equals(output, result));
    }

}
