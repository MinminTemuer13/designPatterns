package org.example;

import org.example.iterableCollections.BinaryTree;
import org.example.iterableCollections.LinkedListCollection;
import org.example.iterators.Iterator;

public class Main {
    public static void main(String[] args) {
        deepFirstBTIterator();
    }

    public static void linkedListIteratorTest() {
        LinkedListCollection collection = new LinkedListCollection();

        collection.push("nation");
        collection.push("clipper");
        collection.push("world");
        collection.pop();
        collection.push("hello");

        Iterator iterator = collection.createIterator();

        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }

    public static void deepFirstBTIterator() {
        BinaryTree tree = new BinaryTree(13);
        tree.generate1stShape();

        Iterator iterator = tree.createIterator();

        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}