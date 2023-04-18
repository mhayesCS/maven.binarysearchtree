package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {
    private BinarySearchTreeNode<Key, Value> Previous;
    private BinarySearchTreeNode<Key, Value> Right;
    private BinarySearchTreeNode<Key, Value> Left;
    private Value value;
    private Key key;



    public BinarySearchTreeNode(Key key, Value value) {
        setLeft(null);
        setRight(null);
        setKey(key);
        setValue(value);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        // TODO
    }

    public Value getValue() {
        return null; // TODO
    }

    public void setValue(Value value) {
        // TODO
    }

    public BinarySearchTreeNode<Key, Value> getLeft() {
        return null; // TODO
    }

    public void setLeft(BinarySearchTreeNode<Key, Value> left) {
        // TODO
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return null; // TODO
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        // TODO
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

