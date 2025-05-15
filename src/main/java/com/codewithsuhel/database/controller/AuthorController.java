package com.codewithsuhel.database.controller;


import com.codewithsuhel.database.domain.Author;
import com.codewithsuhel.database.services.AuthorServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
public class AuthorController {

    private final AuthorServices authorServices;

    public AuthorController(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }

    @GetMapping("/authors")
    public ResponseEntity<Iterable<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorServices.getAllAuthors());
    }

    @PostMapping("/authors")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorServices.addAuthor(author));
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id,@RequestBody Author author){
        return ResponseEntity.ok(authorServices.updateAuthor(id,author));
    }

    @DeleteMapping("/authors/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Long id){
        return ResponseEntity.ok(authorServices.deleteAuthor(id));
    }

}
