package ru.gb.notebook.model.notebook.writer;

import ru.gb.notebook.model.notebook.manager.Notebook;

import java.io.Serializable;

public interface Writable {
    boolean save(Serializable serializable, String path);
    NotebookOrg<> load(String path);
}
