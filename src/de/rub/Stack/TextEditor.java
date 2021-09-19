package de.rub.Stack;

public class TextEditor {
    private String text;

    public TextEditor(String text){
        this.text = text;
        System.out.println(this.text);
    }
    public void aendereText(String text){
        this.text = text;
        System.out.println("neuer Text: " + this.getText());
    }
    public String getText() {
        return text;
    }
}
