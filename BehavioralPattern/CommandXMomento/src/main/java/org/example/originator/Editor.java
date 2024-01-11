package org.example.originator;

import org.example.snapshot.EditSnapshot;

public class Editor {
    private StringBuilder text = new StringBuilder();

    public void addText(String str) {
        text.append(str);
    }

    public void deleteText(int length) {
        if (text.length() >= length) {
            text.delete(text.length() - length, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }

    public EditSnapshot createSnapshot() {
        return new EditSnapshot(text.toString());
    }

    public void restore(EditSnapshot snapshot) {
        text = new StringBuilder(snapshot.text());
    }
}
