package org.example;

import org.example.commands.CopilotSendMessageCommand;
import org.example.commands.CopilotUndoSendMessageCommand;
import org.example.commands.OpenCopilotCommand;
import org.example.commands.ShutDownCopilotCommand;
import org.example.invokers.CopilotShortCut;
import org.example.invokers.SendButton;
import org.example.invokers.UndoButton;
import org.example.invokers.X;
import org.example.receivers.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        CopilotShortCut copilotShortCut = new CopilotShortCut(new OpenCopilotCommand(manager));
        copilotShortCut.onClick();

        SendButton sendButton = new SendButton(new CopilotSendMessageCommand(manager.getCopilot(), "the first Sentence"));
        sendButton.onClick();
        sendButton.setCommand(new CopilotSendMessageCommand(manager.getCopilot(), "the second Sentence"));
        sendButton.onClick();

        System.out.println(manager.getCopilot());

        UndoButton undoButton = new UndoButton(new CopilotUndoSendMessageCommand(manager.getCopilot()));
        undoButton.onClick();

        System.out.println(manager.getCopilot());

        sendButton.setCommand(new CopilotSendMessageCommand(manager.getCopilot(), "the third Sentence"));
        sendButton.onClick();

        System.out.println(manager.getCopilot());

        X x = new X(new ShutDownCopilotCommand(manager));
        x.onClick();
    }
}