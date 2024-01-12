package org.example.publishers;

import org.example.subscribers.Economy;

import java.util.LinkedList;

public class TheEconomist implements Publisher<Economy> {
    private final LinkedList<Economy> list = new LinkedList<>();

    @Override
    public void subscribe(Economy subscriber) {
        list.add(subscriber);
    }

    @Override
    public void unsubscribe(Economy subscriber) {
        list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        list.forEach(Economy::update);
    }
}
