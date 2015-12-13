package com.jf.structures.tree;

import junit.framework.TestCase;

public class BinaryHeapTest extends TestCase {

    public void testHeap() {

        BinaryHeap heap = new BinaryHeap(5);

        heap.insert(3);
        heap.insert(6);
        heap.insert(2);
        heap.insert(9);
        heap.insert(1);

        System.out.println(heap);
        assertEquals(1, heap.deleteMin());
        System.out.println(heap);
        assertEquals(2, heap.deleteMin());
        System.out.println(heap);
        assertEquals(3, heap.deleteMin());
        System.out.println(heap);
        heap.insert(1);
        System.out.println(heap);

    }

    public void testHeapA() {

        BinaryHeap heap = new BinaryHeap(10);

        heap.insert('D');
        heap.insert('G');
        heap.insert('F');
        heap.insert('B');
        heap.insert('K');
        heap.insert('H');
        heap.insert('C');
        heap.insert('E');
        heap.insert('J');
        heap.insert('A');

        assertEquals('A', heap.deleteMin());
        assertEquals('B', heap.deleteMin());
        assertEquals('C', heap.deleteMin());
        assertEquals('D', heap.deleteMin());
        assertEquals('E', heap.deleteMin());
        assertEquals('F', heap.deleteMin());
        assertEquals('G', heap.deleteMin());
        assertEquals('H', heap.deleteMin());
        assertEquals('J', heap.deleteMin());
        assertEquals('K', heap.deleteMin());

    }

}
