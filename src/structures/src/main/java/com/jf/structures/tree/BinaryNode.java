package com.jf.structures.tree;

public class BinaryNode<K extends Comparable<K>, V> implements Comparable<BinaryNode<K,V>> {

    private final K key;
    private final V value;
    private BinaryNode left;
    private BinaryNode right;

    private int level;

    public BinaryNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.level = 0;
    }

    public BinaryNode(K key, V value, int level) {
        this(key, value);
        this.setLevel(level);
    }

    public K getKey() { return key; }
    public V getValue() {
        return value;
    }

    public BinaryNode<K, V> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<K, V> left) {
        this.left = left;
    }

    public BinaryNode<K, V> getRight() {
        return right;
    }

    public void setRight(BinaryNode<K, V> right) {
        this.right = right;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("(key, value, level)(%s,%s,%s)", getKey(), getValue(), getLevel());
    }

    public int compareTo(BinaryNode<K, V> that) {

        int cmp = this.key.compareTo(that.key);

        if(cmp < 0) { return -1; }
        else if(cmp > 0) { return 1; }
        else {
            return 0;
        }

    }

}
