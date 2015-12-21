package com.jf.algorithms.list;

import com.jf.structures.list.SingleLinkedNode;
import com.jf.utils.ArrayUtils;

public final class QuickSortSingleLinkedList {

    private QuickSortSingleLinkedList() { }

    public static void sort(SingleLinkedNode node) {

        sort(node, node, getLast(node));

    }

    private static SingleLinkedNode<Integer> getLast(SingleLinkedNode<Integer> list) {

        SingleLinkedNode curr = list;

        while (curr.getNext() != null) { curr = curr.getNext(); }

        return curr;
    }

    private static void sort(SingleLinkedNode<Integer> list, SingleLinkedNode<Integer> lo, SingleLinkedNode<Integer> hi) {

        if(lo == hi) { return; }

        SingleLinkedNode<Integer> p = partition(lo, hi);

        sort(list, lo, prev(lo, p));
        sort(list, p.getNext(), hi);
    }

    private static SingleLinkedNode<Integer> prev(SingleLinkedNode<Integer> lo, SingleLinkedNode<Integer> p) {

        SingleLinkedNode curr = lo;

        while (curr != null) {
            if(curr.getNext() == p) { return curr; }
            curr = curr.getNext();
        }

        return curr;
    }

    private static SingleLinkedNode partition(SingleLinkedNode<Integer> lo, SingleLinkedNode<Integer> hi) {

        SingleLinkedNode<Integer> r = lo;
        SingleLinkedNode<Integer> p = lo.getNext();

        SingleLinkedNode<Integer> curr = p;

        while(curr != null && curr != hi) {

            if(curr.getValue() < r.getValue()) {

                Integer tmp = curr.getValue();
                curr.setValue(p.getValue());
                p.setValue(tmp);

                p = p.getNext();
            }
            curr = curr.getNext();
        }

        Integer tmp = r.getValue();
        r.setValue(p.getValue());
        p.setValue(tmp);

        return p;
    }




    public static void sort(Integer[] input) {

        sort(input, 0, input.length-1);
    }

    private static void sort(Integer[] input, int lo, int hi) {

        if(lo >= hi) { return; }

        int p = partition(input, lo, hi);

        sort(input, lo, p-1);
        sort(input, p+1, hi);

    }

    private static int partition(Integer[] input, int lo, int hi) {

        int j = lo;
        int p = lo;
        int r = hi;

        while(j < hi) {

            if(input[j] < input[r]) {
                ArrayUtils.exchange(input, j, p);
                p++;
            }
            j++;
        }
        ArrayUtils.exchange(input, p, r);
        return p;
    }
}
