package org.example.caretakers;

import org.example.momentos.EditorSnapshot;
import org.example.originators.Editor;

import java.util.Stack;

public class History {
    private final Stack<EditorSnapshot> snapshots = new Stack<>();

    public void save(EditorSnapshot snapshot) {
        snapshots.push(snapshot);
    }

    public void undo(Editor editor) {
        if (!snapshots.empty()) {
            editor.restore(snapshots.pop());
        }
    }
}
