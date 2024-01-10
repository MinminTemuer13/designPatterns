package org.example.iterators;

import org.example.bases.BinaryTreeNode;
import org.example.iterableCollections.BinaryTree;

import java.util.NoSuchElementException;
import java.util.Stack;

public class DeepFirstBTIterator implements Iterator{
    private final Stack<BinaryTreeNode> stack;

    public DeepFirstBTIterator(BinaryTree collection) {
        this.stack = new Stack<>();
        pushAllLeft(collection.getRoot());
    }

    @Override
    public Object getNext() {
        if (!hasMore()) {
            throw new NoSuchElementException();
        }
        BinaryTreeNode node = stack.pop();
        if (node.hasRight()) {
            pushAllLeft(node.getRightChild());
        }
        return node;
    }

    @Override
    public Boolean hasMore() {
        return !stack.empty();
    }

    private void pushAllLeft(BinaryTreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.getLeftChild();
        }
    }
}
