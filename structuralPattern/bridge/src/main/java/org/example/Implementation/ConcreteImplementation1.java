package org.example.Implementation;

public class ConcreteImplementation1 implements Implementation{
    @Override
    public void method1() {
        System.out.println("method1 in CI1!!");
    }

    @Override
    public void method2(Integer n) {
        System.out.println("CI1's number: " + n);
    }

    @Override
    public void method3(String s) {
        System.out.println("CI1's string: " + s);
    }
}
