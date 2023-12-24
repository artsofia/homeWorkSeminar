package ru.gb.notebook.view;

import ru.gb.notebook.view.commands.AddNote;
import ru.gb.notebook.view.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commandList;

    public Menu(Console console) {
        commandList = new ArrayList<>();
        commandList.add(new AddNote(console));
        commandList.add(new FindNote(console));
        commandList.add(new Finish(console));
        commandList.add(new SortByDate(console));
    }

    public String menu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, i < commandList.size(), i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append(commandList.get(i).getDescriprion());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int getSize() {
        return commandList.size();
    }
}
