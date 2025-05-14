package com.codewithsuhel.database.controller;

import com.codewithsuhel.database.domain.Book;
import com.codewithsuhel.database.services.BookServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    BookServices bookServices;

    public BookController(BookServices bookServices){
        this.bookServices = bookServices;
    }

    @GetMapping("/books")
    public Iterable<Book> getAllBooks(){
         return bookServices.getAllBooks();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }
}
