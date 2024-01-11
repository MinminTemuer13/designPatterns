package org.example.commands;

import org.example.receivers.Copilot;

public class CopilotSendMessageCommand implements Command{
    final Copilot copilot;
    final String message;

    public CopilotSendMessageCommand(Copilot copilot, String message) {
        this.copilot = copilot;
        this.message = message;
    }

    @Override
    public void execute() {
        copilot.sendMessage(message);
    }
}
