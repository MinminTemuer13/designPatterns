package org.example.invokers;

import org.example.commands.OpenCopilotCommand;

public class CopilotShortCut implements Invoker{
    final OpenCopilotCommand command;

    public CopilotShortCut(OpenCopilotCommand command) {
        this.command = command;
    }

    @Override
    public void onClick() {
        command.execute();
    }
}
