package com.codewithsuhel.database.services;

import com.codewithsuhel.database.domain.Book;
import com.codewithsuhel.database.repositories.BookRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    BookRepositories repositories;

    public BookServices(BookRepositories bookRepositories) {
        this.repositories = bookRepositories;
    }

    public Iterable<Book> getAllBooks() {
        return repositories.findAll();
    }

    public Book addBook(Book book) {
        return repositories.save(book);
    }
}
