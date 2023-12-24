package ru.gb.notebook.view.commands;

import ru.gb.notebook.view.Console;

public class SortByDate extends Command {
    public SortByDate(Console console) {
        super(console);
        description = "Отсортировать список по дате";
    }

    public void execute() {
        consoleUI.sortByDate();
    }
}

