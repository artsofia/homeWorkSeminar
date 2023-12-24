package ru.gb.notebook.view.commands;

import ru.gb.notebook.view.Console;

public class Command {
    private String description;
    private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
