package ru.gb.notebook.model.writer;

public interface Writable {
    boolean save(Object o, String pathFile);
    Object load(String pathFile);
    boolean close();
}
