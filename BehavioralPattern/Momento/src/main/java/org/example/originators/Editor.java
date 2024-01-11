package org.example.originators;

import org.example.momentos.EditorSnapshot;

public class Editor {
    private StringBuilder text = new StringBuilder();

    public void addText(String str) {
        text.append(str);
    }

    public String getText() {
        return text.toString();
    }

    public EditorSnapshot createSnapshot() {
        return new EditorSnapshot(text.toString());
    }

    public void restore(EditorSnapshot snapshot) {
        text = new StringBuilder(snapshot.getText());
    }
}
