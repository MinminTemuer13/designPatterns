package org.example.commands;

import org.example.receivers.Copilot;

public class CopilotUndoSendMessageCommand implements Command{
    final Copilot copilot;

    public CopilotUndoSendMessageCommand(Copilot copilot) {
        this.copilot = copilot;
    }

    @Override
    public void execute() {
        copilot.undoSendMessage();
    }
}
