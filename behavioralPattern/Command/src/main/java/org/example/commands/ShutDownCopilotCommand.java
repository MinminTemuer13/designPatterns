package org.example.commands;

import org.example.receivers.Manager;

public class ShutDownCopilotCommand implements Command{
    final Manager manager;

    public ShutDownCopilotCommand(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.shutDown();
    }
}
