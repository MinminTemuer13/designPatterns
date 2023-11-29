package org.example;

public class Main {
    public static void main(String[] args) {
        SubClass1 sub = new SubClass1(3, "try something in EXTENDS");

        sub.readSomething();

        System.out.println(sub.getFeatureNum());
    }
}