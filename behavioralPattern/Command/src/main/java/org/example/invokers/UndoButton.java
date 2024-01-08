package org.example.invokers;

import org.example.commands.CopilotUndoSendMessageCommand;

public class UndoButton implements Invoker{
    final CopilotUndoSendMessageCommand command;

    public UndoButton(CopilotUndoSendMessageCommand command) {
        this.command = command;
    }

    @Override
    public void onClick() {
        command.execute();
    }
}
