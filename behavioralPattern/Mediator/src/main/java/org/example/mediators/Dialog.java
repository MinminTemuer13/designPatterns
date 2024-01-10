package org.example.mediators;

import org.example.components.ChangeButton;
import org.example.components.Component;
import org.example.components.Input;
import org.example.components.ShowButton;

import java.util.LinkedList;

public class Dialog implements Mediator{
    private final LinkedList<Input> inputs;

    public Dialog() {
        this.inputs = new LinkedList<>();
    }

    public void addInput(Input input) {
        inputs.add(input);
    }

    @Override
    public void doNotify(Component component) {
        if (component.getClass() == ChangeButton.class) {
            onClickChangeButton();
        }
        else if (component.getClass() == ShowButton.class) {
            onClickShowButton();
        }
    }

    private void onClickChangeButton() {
        inputs.forEach(Input::onChange);
    }

    private void onClickShowButton() {
        inputs.forEach(System.out::println);
    }
}
