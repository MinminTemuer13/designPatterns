package org.example.command.editorCommand;

import org.example.command.Command;
import org.example.originator.Editor;
import org.example.snapshot.EditSnapshot;

public class DeleteTextCommand implements Command {
    private final int length;
    private final Editor editor;
    private EditSnapshot snapshot;

    public DeleteTextCommand(int length, Editor editor) {
        this.length = length;
        this.editor = editor;
    }

    @Override
    public void execute() {
        snapshot = editor.createSnapshot();
        editor.deleteText(length);
    }

    @Override
    public void undo() {
        editor.restore(snapshot);
    }
}
