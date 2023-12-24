package ru.gb.notebook.view.commands;

import ru.gb.notebook.view.Console;

public class Finish extends Command {
    public Finish(Console console) {
        super(console);
        description = "Закончить работу";
    }

    public void execute() {
        consoleUI.finish();
    }
    }
}
