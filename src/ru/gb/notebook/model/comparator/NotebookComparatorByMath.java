package ru.gb.notebook.model.comparator;

import java.util.Comparator;

public class NotebookComparatorByMath <T extends NotebookIterator> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getMath().compareTo(o2.getMath());;
    }
}
