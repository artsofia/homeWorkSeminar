package ru.gb.notebook.model.notebook.manager;

import ru.gb.notebook.model.comparator.NotebookNode;

import java.io.Serializable;
import java.time.LocalDate;

public class Notebook implements Serializable, NotebookNode<Notebook> {
    private long id;
    private LocalDate date;
    private LocalDate math;
    private String text;

    public Notebook(LocalDate dateTime, String text) {
        this.id = id;
        this.date = date;
        this.math = math;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public LocalDate getMath() {
        return math;
    }

    public void setMath(LocalDate math) {
        this.math = math;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", date=" + date +
                ", math=" + math +
                ", text='" + text + '\'' +
                '}';
    }
}
