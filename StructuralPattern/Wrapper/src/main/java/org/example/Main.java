package org.example;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator decorator = new ConcreteDecorator(component);

        ConcreteDecorator2 decorator2 = new ConcreteDecorator2(decorator);

        decorator2.function();
    }
}