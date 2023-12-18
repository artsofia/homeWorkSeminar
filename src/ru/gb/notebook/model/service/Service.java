package ru.gb.notebook.model.service;

import ru.gb.notebook.model.comparator.NotebookNode;
import ru.gb.notebook.model.notebook.manager.Notebook;
import ru.gb.notebook.model.notebook.writer.Writable;

public class Service<E extends NotebookNode<E>> {
    private Writable writable;
    private Notebook<E> activeNode;

    public Service() {
        activeNode = new Notebook<>();
    }
}
