package ru.gb.notebook.view;

import ru.gb.notebook.presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;

    public Console() {
        scanner = new Scanner(System.in);
        this.work = true;
        menu = new Menu();
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Приветствую! Выберите пункт из меню: ");
        while(work) {
            printMenu();
            execute();
        }
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    private void printMenu() {
        menu.printMenu();
    }

    private void execute() {
        int input = inputMenuValue();
        if(input )
    }
}
