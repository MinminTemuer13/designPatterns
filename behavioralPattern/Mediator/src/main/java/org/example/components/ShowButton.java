package org.example.components;

import org.example.mediators.Mediator;

public class ShowButton extends Component{
    public ShowButton(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void onClick() {
        mediator.doNotify(this);
    }
}
