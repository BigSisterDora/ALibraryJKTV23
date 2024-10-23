package org.example;

import org.example.repository.BookRepository;
import org.example.storages.StorageBook;
import org.example.tools.Input;
import org.example.tools.impl.ConsoleInput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookRepository bookRepository = new StorageBook();
        Input input = new ConsoleInput();

        App app = new App(input, bookRepository);
        app.run();
    }
}