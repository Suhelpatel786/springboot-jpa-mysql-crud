package com.codewithsuhel.database.controller;


import com.codewithsuhel.database.domain.Author;
import com.codewithsuhel.database.services.AuthorServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class AuthorController {

    private final AuthorServices authorServices;

    public AuthorController(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }

    @GetMapping("authors")
    public ResponseEntity<Iterable<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorServices.getAllAuthors());
    }

    @PostMapping("authors")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorServices.addAuthor(author));
    }
}
