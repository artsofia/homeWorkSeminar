package ru.gb.notebook.model.comparator;

import java.util.Comparator;

public class NotebookComparatorByDate<T extends NotebookIterator> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
