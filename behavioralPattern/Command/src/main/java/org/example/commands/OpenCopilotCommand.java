package org.example.commands;

import org.example.receivers.Copilot;
import org.example.receivers.Manager;

public class OpenCopilotCommand implements Command{
    private final Manager manager;

    public OpenCopilotCommand(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.setCopilot(new Copilot());
    }
}
