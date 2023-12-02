package org.example;

public abstract class BaseDecorator implements Component{
    private final Component wrapee;

    public BaseDecorator(Component component) {
        this.wrapee = component;
    }

    @Override
    public void function() {
        wrapee.function();
    }
}
