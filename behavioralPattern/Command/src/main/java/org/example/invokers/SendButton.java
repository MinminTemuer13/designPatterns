package org.example.invokers;

import org.example.commands.CopilotSendMessageCommand;

public class SendButton implements Invoker{
    public void setCommand(CopilotSendMessageCommand command) {
        this.command = command;
    }

    private CopilotSendMessageCommand command;

    public SendButton(CopilotSendMessageCommand command) {
        this.command = command;
    }

    @Override
    public void onClick() {
        command.execute();
    }
}
