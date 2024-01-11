package org.example;

import org.example.caretakers.History;
import org.example.originators.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.addText("this is the first sentence.");
        history.save(editor.createSnapshot());

        editor.addText("this is the second sentence.");
        history.save(editor.createSnapshot());

        editor.addText("this is the third sentence.");
        System.out.println(editor.getText());

        history.undo(editor);
        System.out.println(editor.getText());

        history.undo(editor);
        System.out.println(editor.getText());
    }
}