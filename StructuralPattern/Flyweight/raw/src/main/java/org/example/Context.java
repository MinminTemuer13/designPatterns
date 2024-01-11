package org.example;

public class Context {
    private final int uniqueState;
    private final Flyweight flyweight;

    Context(int uniqueState, Flyweight flyweight) {
        this.uniqueState = uniqueState;
        this.flyweight = flyweight;
    }

    @Override
    public String toString() {
        return "Context{" +
                "uniqueState=" + uniqueState +
                ", flyweight=" + flyweight.getValue() +
                '}';
    }
}
