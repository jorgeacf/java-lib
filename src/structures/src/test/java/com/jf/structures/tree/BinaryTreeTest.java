package com.jf.structures.tree;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTest extends TestCase {

    private BinaryTree<Integer, String> createTestTree() {

        BinaryTree<Integer, String> tree = new BinaryTree<Integer, String>();

        tree.add(5, "5");
        tree.add(3, "3");
        tree.add(7, "7");
        tree.add(1, "1");
        tree.add(4, "4");
        tree.add(6, "6");
        tree.add(8, "8");

        tree.add(99, "99");

        return tree;
    }

    public void testIsBinaryTree() {

        BinaryTree<Integer, String> tree = createTestTree();

        assertTrue(tree.isBST());

    }

    public void testTransverseByLevel() {

        BinaryTree<Integer, String> tree = createTestTree();

        Integer[] nodes = new Integer[tree.size()];

        int i = 0;
        Iterator<BinaryNode<Integer, String>> iterator = tree.iteratorByLevel();
        while(iterator.hasNext()) {
            BinaryNode<Integer, String> n = iterator.next();
            nodes[i] = n.getKey();
            i++;
        }

        Integer[] nodesInLevelOrder = new Integer[] { 5, 3, 7, 1, 4, 6, 8, 99 };

        assertTrue(Arrays.equals(nodes, nodesInLevelOrder));

    }

    public void testTransverseInOrder() {

        BinaryTree<Integer, String> tree = createTestTree();

        Integer[] nodes = new Integer[tree.size()];

        int i = 0;
        Iterator<BinaryNode<Integer, String>> iterator = tree.iteratorInOrder();
        while(iterator.hasNext()) {
            BinaryNode<Integer, String> n = iterator.next();
            nodes[i] = n.getKey();
            i++;
        }

        Integer[] nodesInOrder = new Integer[] { 1, 3, 4, 5, 6, 7, 8, 99 };

        assertTrue(Arrays.equals(nodes, nodesInOrder));
    }

    public void testTransverseInPreOrder() {

        BinaryTree<Integer, String> tree = createTestTree();

        Integer[] nodes = new Integer[tree.size()];

        int i = 0;
        Iterator<BinaryNode<Integer, String>> iterator = tree.iteratorInPreOrder();
        while(iterator.hasNext()) {
            BinaryNode<Integer, String> n = iterator.next();
            nodes[i] = n.getKey();
            i++;
        }

        Integer[] nodesInOrder = new Integer[] { 5, 3, 1, 4, 7, 6, 8, 99 };

        assertTrue(Arrays.equals(nodes, nodesInOrder));
    }

    public void testTransverseInPostOrder() {

        BinaryTree<Integer, String> tree = createTestTree();

        Integer[] nodes = new Integer[tree.size()];

        int i = 0;
        Iterator<BinaryNode<Integer, String>> iterator = tree.iteratorInPostOrder();
        while(iterator.hasNext()) {
            BinaryNode<Integer, String> n = iterator.next();
            nodes[i] = n.getKey();
            i++;
        }

        Integer[] nodesInOrder = new Integer[] { 1, 4, 3, 6, 99, 8, 7, 5 };

        assertTrue(Arrays.equals(nodes, nodesInOrder));
    }

    public void testDeleteNode() {

        BinaryTree<Integer, String> tree = createTestTree();

        int key = 7;

        assertTrue(tree.exists(key));
        tree.delete(key);
        assertFalse(tree.exists(key));
    }

    public void testChildrenList() {

        BinaryTree<Integer, String> tree = createTestTree();

        int key = 7;

        List<Integer> childIds = new LinkedList<Integer>();
        for(BinaryNode<Integer, String> child : tree.children(key)) {
            childIds.add(child.getKey());
        }

        assertTrue(Arrays.equals(childIds.toArray(new Integer[0]), new Integer[] { 6, 8, 99 }));
    }

    public void testMinTreeNode() {

        BinaryTree<Integer, String> tree = createTestTree();

        assertEquals(new Integer(1), tree.min());

    }

    public void testMaxTreeNode() {

        BinaryTree<Integer, String> tree = createTestTree();

        assertEquals(new Integer(99), tree.max());
    }

    public void testTreeHeight() {

        BinaryTree<Integer, String> tree = createTestTree();

        assertEquals(4, tree.height());

        tree.delete(99);

        assertEquals(3, tree.height());
    }


}
