package org.example;

public class ConcreteFlyweight implements Flyweight{
    private final String somethingHeavy;

    ConcreteFlyweight(String s) {
        somethingHeavy = s;
    }

    @Override
    public String getValue() {
        return somethingHeavy;
    }
}
