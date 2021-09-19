package de.rub.Muster;

import java.io.File;

public class Document {
    private File file;

    public Document(String path) {
        file = new File(path);
    }
    public Document(File file) {
        this.file = file;
    }
    public void open() {
        System.out.println("Dokument geöffnet!");
    }
    public void save() {
        System.out.println("Dokument gespeichert!");
    }
    public String getFilePath() {
        return file.toString();
    }
}
