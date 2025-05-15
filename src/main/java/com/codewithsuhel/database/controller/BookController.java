package com.codewithsuhel.database.controller;

import com.codewithsuhel.database.domain.Book;
import com.codewithsuhel.database.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {

    BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping("/books")
    public Iterable<Book> getAllBooks() {
        return bookServices.getAllBooks();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookServices.addBook(book);
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<Book> updateBook(@PathVariable String isbn, @RequestBody Book book) {
        return ResponseEntity.ok(bookServices.updateBook(isbn, book));
    }

    @DeleteMapping("/books/{isbn}")
    public ResponseEntity<Book> deleteBook(@PathVariable String isbn) {
        return ResponseEntity.ok(bookServices.deleteBook(isbn));
    }
}
