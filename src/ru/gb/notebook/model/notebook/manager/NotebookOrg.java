package ru.gb.notebook.model.notebook.manager;

import ru.gb.notebook.model.comparator.NotebookComparatorByDate;
import ru.gb.notebook.model.comparator.NotebookComparatorByMath;
import ru.gb.notebook.model.comparator.NotebookNode;
import ru.gb.notebook.model.notebook.manager.Notebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NotebookOrg<E extends NotebookNode<E>> implements Serializable, Iterable<E> {
    private List<E> notebook;

    public NotebookOrg() {
        notebook = new ArrayList<>();
    }

    public void add(Notebook notebook) {
        notebook.add(notebook);
    }

    public void display() {
        for (E notebook: notebook) {
            System.out.println(notebook);
        }
    }

    public void sortByDate(List<E> list) {
        list.sort(new NotebookComparatorByDate<>());
    }

    public void sortByMath(List<E> list) {
        list.sort(new NotebookComparatorByMath<>());
    }
}
