package com.jf.structures.tree;

import junit.framework.TestCase;

import java.util.Iterator;

public class BinaryTreeTest extends TestCase {

    public void testSimpleTree() {

        BinaryTree<Integer, String> tree = new BinaryTree<Integer, String>();

        tree.add(5, "5");
        tree.add(3, "3");
        tree.add(7, "7");
        tree.add(1, "1");
        tree.add(4, "4");
        tree.add(6, "6");
        tree.add(8, "8");

        tree.add(99, "99");

        System.out.println(tree.isBST());

        Iterator<BinaryNode<Integer, String>> iterator1 = tree.iteratorByLevel();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        tree.delete(7); System.out.println("DELETE");

        Iterator<BinaryNode<Integer, String>> iterator2 = tree.iteratorByLevel();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("CHILDREN");
        for(BinaryNode<Integer, String> child : tree.children(7)) {
            System.out.println(child);
        }

        tree.printPre();

        tree.printPos();

        System.out.println(String.format("Key=%s, Value=%s", "6", tree.get(6)));

        System.out.println("min:" + tree.min());
        System.out.println("max:" + tree.max());

        System.out.println("height:" + tree.height());
        System.out.println(String.format("size: %d, children %d", tree.size(), tree.numberOfChildren()));
    }

}
