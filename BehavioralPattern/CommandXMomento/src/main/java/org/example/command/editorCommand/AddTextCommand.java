package org.example.command.editorCommand;

import org.example.command.Command;
import org.example.originator.Editor;
import org.example.snapshot.EditSnapshot;

public class AddTextCommand implements Command {
    private final String string;
    private final Editor editor;
    private EditSnapshot snapshot;

    public AddTextCommand(String string, Editor editor) {
        this.string = string;
        this.editor = editor;
    }

    @Override
    public void execute() {
        snapshot = editor.createSnapshot();
        editor.addText(string);
    }

    @Override
    public void undo() {
        editor.restore(snapshot);
    }
}
