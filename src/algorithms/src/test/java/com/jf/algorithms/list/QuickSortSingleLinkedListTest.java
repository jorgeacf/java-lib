package com.jf.algorithms.list;

import com.jf.utils.ArrayUtils;
import junit.framework.TestCase;

import java.util.Arrays;

public class QuickSortSingleLinkedListTest extends TestCase {

    public void testSortingSingleLinkedList() {

        /*
        Integer[] input = new Integer[] { 7, 3, 9, 1, 2, 6, 4, 8, 5, 0 };
        SingleLinkedNode list = SingleLinkedListUtils.makeNodeFromArray(input);

        QuickSortSingleLinkedList.sort(list);

        Integer[] output = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] result = (Integer[])SingleLinkedListUtils.toArray(list);

        assertTrue(Arrays.equals(result, output));
        */
    }

    public void test() {

        Integer[] input = new Integer[] { 7, 3, 9, 1, 2, 6, 4, 8, 5, 0 };

        QuickSortSingleLinkedList.sort(input);

        Integer[] output = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(ArrayUtils.printValues(input));

        assertTrue(Arrays.equals(input, output));
    }

}
