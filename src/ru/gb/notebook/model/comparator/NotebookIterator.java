package ru.gb.notebook.model.comparator;

import java.util.Iterator;
import java.util.List;

public class NotebookIterator<E> implements Iterator<E> {
    private int index;
    private List<E> list;

    public NotebookIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}
