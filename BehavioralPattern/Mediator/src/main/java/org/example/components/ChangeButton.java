package org.example.components;

import org.example.mediators.Mediator;

public class ChangeButton extends Component{
    public ChangeButton(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void onClick() {
        mediator.doNotify(this);
    }
}
