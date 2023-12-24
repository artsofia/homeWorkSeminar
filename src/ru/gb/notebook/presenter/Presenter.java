package ru.gb.notebook.presenter;

import ru.gb.notebook.model.service.Service;
import ru.gb.notebook.view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addNote(LocalDate date) {
        // какой-то ответ
        getNotebookListInfo();
    }

    public void getNotebookListInfo() {
        String text = service.getNotebookListInfo();
        view.print(text);
    }

    public sortByDate() {
        service.sortByDate();
        getNotebookListInfo();
    }
}
