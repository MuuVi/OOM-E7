package de.rub.Muster;

public class ActionOpen implements ActionListenerCommand {
    private Document document;

    public ActionOpen(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.open();
        System.out.println("Dokument " + document.getFilePath() + " geöffnet!");
    }
}
