package com.jf.structures.tree;

import com.jf.structures.list.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinaryTree<K extends Comparable<K>, V> {

    private BinaryNode<K, V> root;
    private int size;

    public BinaryTree() {
        size = 0;
    }

    public int size() { return size; }

    public void add(K key, V value) {
        add(new BinaryNode<K, V>(key, value));
    }

    public void delete(K key) {
        delete(root, key);
    }

    public K min() {
        return min(root);
    }

    public K max() {
        return max(root);
    }

    public int height() {
        return height(root);
    }

    public V get(K key) {
        BinaryNode<K, V> node = get(root, key);
        return node != null ? node.getValue() : null;
    }

    public boolean exists(K key) {
        return get(key) != null;
    }

    public Iterable<BinaryNode<K,V>> children(K key) {

        BinaryNode<K, V> node = get(root, key);

        Queue<BinaryNode<K, V>> queue = new Queue<BinaryNode<K, V>>();

        children(node, queue, key);

        return queue;
    }

    public int numberOfChildren() {
        return numberOfChildren(root);
    }

    public boolean isBST() {
        return isBST(root, min(), max());
    }


    private void add(BinaryNode<K, V> newNode) {

        if(root == null) {
            root = newNode;
            newNode.setLevel(1);
        }
        else {
            add(root, 1, newNode);
        }

        size++;
    }

    private void children(BinaryNode<K, V> node, Queue<BinaryNode<K, V>> queue, K key) {

        if(node == null) { return; }

        if(node.getLeft() != null) { queue.enqueue(node.getLeft()); children(node.getLeft(), queue, key); }
        if(node.getRight() != null) { queue.enqueue(node.getRight()); children(node.getRight(), queue, key); }

    }

    private boolean isBST(BinaryNode<K, V> current, K minKey, K maxKey) {

        if(current == null) { return true; }
        if(current.getKey().compareTo(minKey) < 0 || current.getKey().compareTo(maxKey) > 0) { return false; }

        return isBST(current.getLeft(), minKey, maxKey) && isBST(current.getRight(), minKey, maxKey);
    }

    private BinaryNode<K, V> add(BinaryNode<K, V> current, int level, BinaryNode<K, V> newNode) {

        if(current == null) { return null; }

        int cmp = current.compareTo(newNode);

        if (cmp > 0) {

            if(current.getLeft() == null) {
                current.setLeft(newNode);
                newNode.setLevel(current.getLevel() + 1);
            }
            else {
                return add(current.getLeft(), level + 1, newNode);
            }
        }
        else if (cmp < 0) {

            if(current.getRight() == null) {
                current.setRight(newNode);
                newNode.setLevel(current.getLevel() + 1);
            }
            else {
                return add(current.getRight(), level + 1, newNode);
            }
        }

        return null;
    }

    private K min(BinaryNode<K, V> current) {

        //if(current == null) { return null; }
        if(current.getLeft() == null) { return current.getKey(); }

        return min(current.getLeft());
    }

    private K max(BinaryNode<K, V> current) {

        //if(current == null) { return null; }
        if(current.getRight() == null) { return current.getKey(); }

        return max(current.getRight());
    }

    private int height(BinaryNode<K, V> current) {

        if(current == null) { return 0; }

        int left = current.getLeft() == null ? current.getLevel() : height(current.getLeft());
        int right = current.getRight() == null ? current.getLevel() : height(current.getRight());

        return Math.max(left, right);
    }

    private BinaryNode<K,V> get(BinaryNode<K, V> current, K key) {

        if(current == null) { return null; }

        int cmp = current.getKey().compareTo(key);
        if(cmp > 0) { return get(current.getLeft(), key); }
        else if(cmp < 0) { return get(current.getRight(), key); }

        return current;
    }

    private int numberOfChildren(BinaryNode<K, V> current) {

        Queue<BinaryNode<K,V>> queue = new Queue<BinaryNode<K,V>>();
        queue.enqueue(current);

        int count = 0;
        while(!queue.isEmpty()) {

            BinaryNode<K, V> n = queue.dequeue();
            if(n.getLeft() != null) { queue.enqueue(n.getLeft()); }
            if(n.getRight() != null) { queue.enqueue(n.getRight()); }

            count++;
        }
        return count;
    }

    private BinaryNode<K, V> delete(BinaryNode<K, V> node, K key) {

        if(node == null) { return null; }


        if(node.getLeft() != null && node.getLeft().getKey().compareTo(key) == 0) { node.setLeft(null); return node; }
        if(node.getRight() != null && node.getRight().getKey().compareTo(key) == 0) { node.setRight(null); return node; }



        int cmp = node.getKey().compareTo(key);
        if      (cmp > 0) { return delete(node.getLeft(), key); }
        else if (cmp < 0) { return delete(node.getRight(), key); }

        throw new RuntimeException();
    }


    //
    //  Transverse by level
    //
    public List<K> keysByLevel() {
        List<K> keys = new LinkedList<K>();
        Iterator<BinaryNode<K,V>> iterator = this.iteratorByLevel();
        while(iterator.hasNext()) {
            keys.add(iterator.next().getKey());
        }
        return keys;
    }

    public Iterator<BinaryNode<K, V>> iteratorByLevel() {
        return new IteratorByLevel(root);
    }

    private class IteratorByLevel implements Iterator<BinaryNode<K, V>> {

        private final Queue<BinaryNode<K, V>> queue;
        public IteratorByLevel(BinaryNode<K,V> root) {
            queue = new Queue<BinaryNode<K,V>>();
            queue.enqueue(root);
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }

        public BinaryNode<K, V> next() {

            if(!hasNext()) { throw new NoSuchElementException(); }

            BinaryNode<K, V> node = queue.dequeue();

            if(node.getLeft() != null) { queue.enqueue(node.getLeft()); }
            if(node.getRight() != null) { queue.enqueue(node.getRight()); }

            return node;
        }

    }

    //
    // Transverse in order
    //
    public List<K> keysInOrder() {
        List<K> keys = new LinkedList<K>();

        Iterator<BinaryNode<K, V>> iterator = iteratorInOrder();

        while(iterator.hasNext()) {
            keys.add(iterator.next().getKey());
        }

        return keys;
    }

    public Iterator<BinaryNode<K, V>> iteratorInOrder() {
        return new IteratorInOrder(root);
    }

    private class IteratorInOrder implements Iterator<BinaryNode<K, V>> {

        private final List<BinaryNode<K, V>> keys;
        private final Iterator<BinaryNode<K, V>> iterator;

        public IteratorInOrder(BinaryNode<K, V> root) {
            keys = getKeys(root);
            iterator = keys.iterator();
        }

        private List<BinaryNode<K, V>> getKeys(BinaryNode<K, V> root) {
            List<BinaryNode<K, V>> nodes = new LinkedList<BinaryNode<K, V>>();
            getKeys(root, nodes);
            return nodes;
        }

        private void getKeys(BinaryNode<K, V> node, List<BinaryNode<K, V>> list) {

            if(node == null) { return; }

            getKeys(node.getLeft(), list);
            list.add(node);
            getKeys(node.getRight(), list);

        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

        public BinaryNode<K, V> next() {
            return iterator.next();
        }
    }

    //
    // Transverse pre order
    //
    public List<K> keysInPreOrder() {
        List<K> keys = new LinkedList<K>();

        Iterator<BinaryNode<K, V>> iterator = iteratorInPreOrder();

        while(iterator.hasNext()) {
            keys.add(iterator.next().getKey());
        }

        return keys;
    }

    public Iterator<BinaryNode<K, V>> iteratorInPreOrder() {
        return new IteratorInPreOrder(root);
    }

    private class IteratorInPreOrder implements Iterator<BinaryNode<K, V>> {

        private final List<BinaryNode<K, V>> keys;
        private final Iterator<BinaryNode<K, V>> iterator;

        public IteratorInPreOrder(BinaryNode<K, V> root) {
            keys = getKeys(root);
            iterator = keys.iterator();
        }

        private List<BinaryNode<K, V>> getKeys(BinaryNode<K, V> root) {
            List<BinaryNode<K, V>> nodes = new LinkedList<BinaryNode<K, V>>();
            getKeys(root, nodes);
            return nodes;
        }

        private void getKeys(BinaryNode<K, V> node, List<BinaryNode<K, V>> list) {

            if(node == null) { return; }

            list.add(node);
            getKeys(node.getLeft(), list);
            getKeys(node.getRight(), list);

        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

        public BinaryNode<K, V> next() {
            return iterator.next();
        }
    }

    //
    // Transverse pos order
    //
    public List<K> keysInPosOrder() {
        List<K> keys = new LinkedList<K>();

        Iterator<BinaryNode<K, V>> iterator = iteratorInPreOrder();

        while(iterator.hasNext()) {
            keys.add(iterator.next().getKey());
        }
        return keys;
    }

    public Iterator<BinaryNode<K, V>> iteratorInPostOrder() { return new IteratorInPostOrder(root); }

    private class IteratorInPostOrder implements Iterator<BinaryNode<K, V>> {

        private final List<BinaryNode<K, V>> keys;
        private final Iterator<BinaryNode<K, V>> iterator;

        public IteratorInPostOrder(BinaryNode<K, V> root) {
            keys = getKeys(root);
            iterator = keys.iterator();
        }

        private List<BinaryNode<K, V>> getKeys(BinaryNode<K, V> root) {
            List<BinaryNode<K, V>> nodes = new LinkedList<BinaryNode<K, V>>();
            getKeys(root, nodes);
            return nodes;
        }

        private void getKeys(BinaryNode<K, V> node, List<BinaryNode<K, V>> list) {

            if (node == null) {
                return;
            }

            getKeys(node.getLeft(), list);
            getKeys(node.getRight(), list);
            list.add(node);

        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

        public BinaryNode<K, V> next() {
            return iterator.next();
        }
    }

}
