package de.rub.Muster;

public class ActionSave implements ActionListenerCommand {
    private Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.save();
        System.out.println("Dokument " + document.getFilePath() + " gespeichert!");
    }
}
