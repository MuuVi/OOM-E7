package de.rub.Muster;

public class Benutzer {
    public static void main(String[] args) {
        Document document = new Document("test.txt");
        ActionListenerCommand open = new ActionOpen(document);
        ActionListenerCommand save = new ActionSave(document);
        MenuOptionen menu = new MenuOptionen(open, save);
        menu.clickOpen();
        menu.clickSave();
    }
}
