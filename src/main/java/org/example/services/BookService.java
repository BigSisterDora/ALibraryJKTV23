package org.example.services;

import org.example.model.Book;
import org.example.helpers.AppHelperBook;
import org.example.repository.BookRepository;
import org.example.tools.Input;

public class BookService {
    private final Input input;
    private final BookRepository bookRepository;

    public BookService(Input input, BookRepository bookRepository) {
        this.input = input;
        this.bookRepository = bookRepository;

    }

    public boolean addBook(AppHelperBook appHelperBook){
        Book book = appHelperBook.createBook(input);
        if(book != null) {
            bookRepository.saveBook(book);
            return true;
        }else{
            return false;
        }
    }
}
