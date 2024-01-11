package org.example.components;

import org.example.mediators.Mediator;

public class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void onClick() {

    }
}
