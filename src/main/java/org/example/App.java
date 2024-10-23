package org.example;

import org.example.repository.BookRepository;
import org.example.services.BookService;
import org.example.helpers.AppHelperBook;
import org.example.services.UserService;
import org.example.tools.Input;

import java.util.Scanner;

public class App {

    private final Input input;
    private Scanner scanner = new Scanner(System.in);
    private BookRepository bookRepository;

    public App(Input input, BookRepository bookRepository) {
        this.input = input;
        this.bookRepository = bookRepository;
    }
    public void run() {
        boolean repeat = true;
        System.out.println("--------------- JKTV23 библиотека --------------");
        do {
            System.out.println("Список задач: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Список книг");
            System.out.println("4. Список читателей");
            System.out.println("5. Выдать книгу");
            System.out.println("6. Вернуть книгу");
            System.out.print("Выберите номер задачи из списка: ");
            int task = Integer.parseInt(input.nextLine());
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    BookService bookService = new BookService(input, bookRepository);
                    bookService.addBook(new AppHelperBook());
                    break;
                case 2:
                    UserService userService = new UserService(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Выберите номер задачи из списка!");
            }
        }while (repeat);
        System.out.println("До свидания!");

    }
}