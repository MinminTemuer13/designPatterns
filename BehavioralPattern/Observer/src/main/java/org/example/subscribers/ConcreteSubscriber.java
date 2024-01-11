package org.example.subscribers;

public class ConcreteSubscriber implements Subscriber{
    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": notification received");
    }
}
