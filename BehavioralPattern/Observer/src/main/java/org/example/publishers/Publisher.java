package org.example.publishers;

import org.example.subscribers.Subscriber;

import java.util.LinkedList;

public class Publisher {
    private final LinkedList<Subscriber> subscribers = new LinkedList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(Subscriber::update);
    }
}
