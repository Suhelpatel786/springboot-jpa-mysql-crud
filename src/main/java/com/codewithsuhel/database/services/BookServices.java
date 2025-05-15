package com.codewithsuhel.database.services;

import com.codewithsuhel.database.domain.Book;
import com.codewithsuhel.database.repositories.BookRepositories;
import org.springframework.stereotype.Service;

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

    public Book updateBook(String id, Book book) {
        return repositories.findById(id).map(bookDetails -> {
            bookDetails.setAuthor(book.getAuthor());
            bookDetails.setTitle(book.getTitle());
            return repositories.save(bookDetails);
        }).orElseThrow(() -> new RuntimeException("Book not found with isbn: " + book.getIsbn()));
    }

    public Book deleteBook(String id) {
        Book book = repositories.findById(id).orElseThrow(() -> new RuntimeException("Book not found with isbn: " + id
        ));
        repositories.deleteById(id);
        return book;
    }

}
