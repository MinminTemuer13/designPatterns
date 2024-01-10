package org.example.iterators;

import org.example.iterableCollections.LinkedListCollection;

public class LinkedListIterator implements Iterator{
    LinkedListCollection collection;
    Integer iterationState;

    public LinkedListIterator(LinkedListCollection collection) {
        this.collection = collection;
        this.iterationState = 0;
    }

    @Override
    public Object getNext() {
        String str = collection.get(iterationState);
        iterationState += 1;
        return str;
    }

    @Override
    public Boolean hasMore() {
        return collection.size() > iterationState;
    }
}
