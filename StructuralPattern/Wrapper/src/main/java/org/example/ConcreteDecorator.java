package org.example;

public class ConcreteDecorator extends BaseDecorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void function() {
        super.function();
        ultra();
    }

    private void ultra() {
        System.out.println("Do something in ULTRA");
    }
}
