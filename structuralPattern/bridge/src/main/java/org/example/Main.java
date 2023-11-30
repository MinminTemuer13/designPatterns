package org.example;

import org.example.Abstraction.RefinedAbstraction;
import org.example.Implementation.ConcreteImplementation1;
import org.example.Implementation.ConcreteImplementation2;

public class Main {
    public static void main(String[] args) {
        ConcreteImplementation2 concreteImplementation1 = new ConcreteImplementation2();

        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementation1);

        refinedAbstraction.feature1();
        refinedAbstraction.feature2(5, "Xiaobao");
    }
}