package org.example;

public abstract class SuperClass {
    private final int featureNum;

    SuperClass(int n) {
        featureNum = n;
    }

    public int getFeatureNum() {
        return featureNum;
    }

    public abstract void readSomething();
}
