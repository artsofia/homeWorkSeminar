package ru.gb.notebook.view.commands;

import ru.gb.notebook.view.Console;

public class AddNote extends Command {
    public AddNote(Console console) {
        super(console);
        description = "Добавить запись";
    }

    public void execute() {
        consoleUI.addNote();
    }
}
