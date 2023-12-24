package ru.gb.notebook.view.commands;

import ru.gb.notebook.view.Console;

public class FindNote extends Command {
    public FindNote(Console console) {
        super(console);
        description = "Найти запись";
    }

    public void execute() {
        consoleUI.findNote();
    }
}
