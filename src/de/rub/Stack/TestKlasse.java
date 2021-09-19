package de.rub.Stack;

public class TestKlasse {
    public static void main(String[] args) {
        CommandManager manager = new CommandManager();
        TextEditor editor = new TextEditor("abc");
        EditorCommand append = new AppendTextCommand(editor, "def");
        manager.executeCommand(append);
        manager.undo();
    }
}
