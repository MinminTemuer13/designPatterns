package org.example.iterableCollections;

import org.example.bases.BinaryTreeNode;
import org.example.iterators.DeepFirstBTIterator;
import org.example.iterators.Iterator;

public class BinaryTree implements IterableCollection{
    final BinaryTreeNode root;

    public BinaryTree(int value) {
        this.root = new BinaryTreeNode(value, null, null);
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void generate1stShape() {
        BinaryTreeNode a = new BinaryTreeNode(213, null, null);
        BinaryTreeNode b = new BinaryTreeNode(12, a, null);
        BinaryTreeNode c = new BinaryTreeNode(42, b, null);
        BinaryTreeNode d = new BinaryTreeNode(6, null, c);
        BinaryTreeNode e = new BinaryTreeNode(82, null, null);
        BinaryTreeNode f = new BinaryTreeNode(84, null, null);
        BinaryTreeNode g = new BinaryTreeNode(1923, e, f);
        BinaryTreeNode h = new BinaryTreeNode(60, null, g);
        root.setLeftChild(d);
        root.setRightChild(h);
    }

    @Override
    public Iterator createIterator() {
        return new DeepFirstBTIterator(this);
    }
}
