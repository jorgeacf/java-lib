package com.jf.algorithms.list;

import com.jf.stuctures.list.SingleLinkedList;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Iterator;

public class SingleLinkedListUtilsTest extends TestCase {

    public void testMakeLinkedListFromArray() {

        Integer[] input = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        SingleLinkedList<Integer> result = SingleLinkedListUtils.makeFromArray(input);

        Iterator<Integer> iterator = result.iterator();
        for(int i = 0; i < result.size(); i++) {
            assertEquals(new Integer(i), iterator.next());
        }

    }

    public void testToArray() {

        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

        for(int i = 9; i >= 0; i--) { list.addFirst(i); }

        Integer[] output = SingleLinkedListUtils.toArray(list);

        assertTrue(Arrays.equals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, output));
    }


}
