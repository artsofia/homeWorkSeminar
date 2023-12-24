package ru.gb.notebook.model.notebook;

import ru.gb.notebook.model.comparator.NotebookComparatorByDate;
import ru.gb.notebook.model.comparator.NotebookIterator;
import ru.gb.notebook.model.comparator.NotebookNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotebookWork<E extends NotebookNode> implements Iterable<E> {
    private List<E> noteBook;

    public NotebookWork() {
        noteBook = new ArrayList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return new NotebookIterator<>(noteBook);
    }

    public void addNote(E notebook) {
        noteBook.add(notebook);
    }

    public void findNote(E notebook) {
        for (E note : noteBook) {
            if (note.equals(notebook)) {
                System.out.println(note);
            }
        }
    }

    public void sortByDate(List<E> list) {
        list.sort(new NotebookComparatorByDate<>());
    }

}
