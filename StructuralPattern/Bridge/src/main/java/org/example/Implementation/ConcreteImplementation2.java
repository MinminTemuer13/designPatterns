package org.example.Implementation;

public class ConcreteImplementation2 implements Implementation{
    @Override
    public void method1() {
        System.out.println("CI2 do method1!!");
    }

    @Override
    public void method2(Integer n) {
        System.out.println("Number: " + n + " in CI2");
    }

    @Override
    public void method3(String s) {
        System.out.println("String: " + s + " in CI2");
    }
}
