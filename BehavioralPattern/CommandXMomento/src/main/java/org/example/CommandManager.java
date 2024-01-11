package org.example;

import org.example.command.Command;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.empty()) {
            history.pop().undo();
        }
    }
}
