package org.example.iterableCollections;

import org.example.iterators.Iterator;
import org.example.iterators.LinkedListIterator;

import java.util.LinkedList;

public class LinkedListCollection implements IterableCollection{
    final LinkedList<String> list = new LinkedList<>();

    public void push(String str) {
        list.push(str);
    }

    public String pop() {
        return list.pop();
    }

    public Integer size() {
        return list.size();
    }

    public String get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(this);
    }
}
