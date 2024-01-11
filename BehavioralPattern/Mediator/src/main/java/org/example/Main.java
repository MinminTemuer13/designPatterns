package org.example;

import org.example.components.ChangeButton;
import org.example.components.Input;
import org.example.components.ShowButton;
import org.example.mediators.Dialog;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        ChangeButton changeButton = new ChangeButton(dialog);
        ShowButton showButton = new ShowButton(dialog);
        Input input1 = new Input();
        Input input2 = new Input();
        Input input3 = new Input();
        dialog.addInput(input1);
        dialog.addInput(input2);
        dialog.addInput(input3);

        showButton.onClick();
        System.out.println("----------------");
        changeButton.onClick();
        showButton.onClick();
        System.out.println("----------------");
        changeButton.onClick();
        showButton.onClick();
    }
}