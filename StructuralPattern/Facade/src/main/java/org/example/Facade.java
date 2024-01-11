package org.example;

public class Facade {
    private final SubSystem1 subSystem1;
    private final SubSystem2 subSystem2;

    public Facade() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
    }

    public void funcA() {
        subSystem1.methodA();
        subSystem2.methodB();
    }

    public void funcB() {
        subSystem2.methodB();
    }
}
