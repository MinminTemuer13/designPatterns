package org.example.publishers;

import org.example.subscribers.Technology;

import java.util.LinkedList;

public class CCF implements Publisher<Technology> {
    private final LinkedList<Technology> list = new LinkedList<>();

    @Override
    public void subscribe(Technology subscriber) {
        list.add(subscriber);
    }

    @Override
    public void unsubscribe(Technology subscriber) {
        list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        list.forEach(Technology::update);
    }
}
