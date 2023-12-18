package ru.gb.notebook.model.comparator;

import java.io.Serializable;
import java.time.LocalDate;

public interface NotebookNode<T> extends Serializable {
    LocalDate getDate();
    LocalDate getMath();
}
