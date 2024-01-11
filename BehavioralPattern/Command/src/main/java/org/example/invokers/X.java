package org.example.invokers;

import org.example.commands.ShutDownCopilotCommand;

public class X implements Invoker{
    final ShutDownCopilotCommand command;

    public X(ShutDownCopilotCommand command) {
        this.command = command;
    }

    @Override
    public void onClick() {
        command.execute();
    }
}
