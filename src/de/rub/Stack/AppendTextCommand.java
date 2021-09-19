package de.rub.Stack;

public class AppendTextCommand implements EditorCommand{
    private String textAlt;
    private String textToAppend;
    private TextEditor textEditor;

    public AppendTextCommand(TextEditor editor, String text){
        this.textEditor = editor;
        this.textAlt = this.textEditor.getText();
        this.textToAppend = text;
    }

    @Override
    public void execute() {
        textEditor.aendereText(textAlt + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.aendereText(textAlt);
    }
}
