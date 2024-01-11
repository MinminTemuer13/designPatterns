package org.example;

import org.example.publishers.Publisher;
import org.example.subscribers.ConcreteSubscriber;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        ConcreteSubscriber subscriber1 = new ConcreteSubscriber("Kawhi");
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber("Paul");
        ConcreteSubscriber subscriber3 = new ConcreteSubscriber("James");
        ConcreteSubscriber subscriber4 = new ConcreteSubscriber("Russell");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);
        publisher.subscribe(subscriber4);

        publisher.notifySubscribers();

        System.out.println("-----------");

        publisher.unsubscribe(subscriber4);

        publisher.notifySubscribers();
    }
}