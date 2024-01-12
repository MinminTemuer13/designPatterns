package org.example.publishers;

import org.example.subscribers.Subscriber;

public interface Publisher<T extends Subscriber> {
    void subscribe(T subscriber);
    void unsubscribe(T subscriber);
    void notifySubscribers();
}
