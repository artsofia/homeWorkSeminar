package ru.gb.notebook.model.notebook;

import ru.gb.notebook.model.comparator.NotebookNode;

import java.time.LocalDate;

public class Notebook implements NotebookNode<Notebook> {
    private int id;
    private String note;
    private LocalDate date;

    public Notebook(int id, String note, LocalDate date) {
        this.id = id;
        this.note = note;
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Notebook o) {
        return note.compareTo(o.note);
    }
}
