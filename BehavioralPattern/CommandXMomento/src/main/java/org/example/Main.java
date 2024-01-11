package org.example;

import org.example.command.editorCommand.AddTextCommand;
import org.example.command.editorCommand.DeleteTextCommand;
import org.example.originator.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandManager manager = new CommandManager();

        AddTextCommand addTextCommand1 = new AddTextCommand("Lets go", editor);
        AddTextCommand addTextCommand2 = new AddTextCommand(", Lakers!", editor);
        AddTextCommand addTextCommand3 = new AddTextCommand("Clippers!", editor);
        DeleteTextCommand deleteTextCommand = new DeleteTextCommand(7, editor);

        manager.executeCommand(addTextCommand1);
        manager.executeCommand(addTextCommand2);
        manager.executeCommand(deleteTextCommand);
        manager.executeCommand(addTextCommand3);

        AddTextCommand addTextCommand4 = new AddTextCommand("trash", editor);
        manager.executeCommand(addTextCommand4);

        System.out.println(editor.getText());

        manager.undo();

        System.out.println(editor.getText());
    }
}