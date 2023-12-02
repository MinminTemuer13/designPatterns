package org.example;

public class ConcreteDecorator2 extends BaseDecorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void function() {
        super.function();
        ultra();
    }

    public void ultra() {
        System.out.println("One more ULTRA");
    }
}
