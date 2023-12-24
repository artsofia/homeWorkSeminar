package ru.gb.notebook.model.service;

import ru.gb.notebook.model.notebook.Notebook;

import java.time.LocalDate;

public class Service {
    private int idNote;
    private Notebook<Notebook> activeNode;

    public Service() {
        activeNode = new Notebook<>();
    }

    public void addNote(String note, LocalDate date) {
        Notebook notebook = new Notebook(idNote++, note, date);
        activeNode.addNote(notebook);
    }

    public String getNoteBookListInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список записей:\n");
        for (Notebook notebook: activeNode) {
            sb.append(notebook);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByDate() {
        activeNode.sortByDate();
    }
}
