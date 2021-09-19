package de.rub.Stack;

import java.util.Stack;

public class CommandManager {
    private Stack<EditorCommand> undoItems = new Stack<EditorCommand>();

    public void executeCommand(EditorCommand cmd){
        cmd.execute();
        undoItems.push(cmd);
    }
    public void undo(){
        undoItems.pop().undo();
    }
}
