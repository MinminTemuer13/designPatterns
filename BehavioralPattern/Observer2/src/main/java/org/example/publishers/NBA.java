package org.example.publishers;

import org.example.subscribers.Sport;

import java.util.LinkedList;

public class NBA implements Publisher<Sport>{
    private final LinkedList<Sport> list = new LinkedList<>();

    @Override
    public void subscribe(Sport subscriber) {
        list.add(subscriber);
    }

    @Override
    public void unsubscribe(Sport subscriber) {
        list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        list.forEach(Sport::update);
    }
}
