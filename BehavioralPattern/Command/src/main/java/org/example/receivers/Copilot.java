package org.example.receivers;

import java.util.ArrayList;
import java.util.List;

public class Copilot {
    private final List<String> messageHistory = new ArrayList<>();

    public void sendMessage(String msg) {
        messageHistory.add(msg);
    }

    public void undoSendMessage() {
        messageHistory.remove(messageHistory.size() - 1);
    }

    @Override
    public String toString() {
        return "Copilot{" +
                "messageHistory=" + messageHistory +
                '}';
    }
}
