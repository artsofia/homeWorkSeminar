package ru.gb.notebook.view;

import ru.gb.notebook.presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public Console() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new Menu();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Приветствую! Выберите пункт из меню: ");
        while (work) {
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("Приятно было пообщаться");
        work = false;
    }

    public void sortByDate() {
        presenter.sortByDate();
    }

    public void getNotebookListInfo() {
        presenter.getNotebookListInfo();
    }

    public void addNote() {
        System.out.println("Введите дату записи");
        String note = scanner.nextLine();
        presenter.addNote(date);
    }

    private void execute(){
        String line = scanner.nextLine();
        if (checkTextForInt(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand){
        if (numCommand < menu.getSize()){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void inputError(){
        System.out.println(INPUT_ERROR);
    }
}
