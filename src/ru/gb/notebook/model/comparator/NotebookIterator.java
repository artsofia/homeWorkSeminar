package ru.gb.notebook.model.comparator;

import java.util.Iterator;
import java.util.List;

public class NotebookIterator<T extends NotebookIterator> implements Iterator<T> {
    private int index;
    private List<T> list;

    public NotebookIterator(List<T> list) {
        index = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
