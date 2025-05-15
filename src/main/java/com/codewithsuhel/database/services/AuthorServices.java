package com.codewithsuhel.database.services;

import com.codewithsuhel.database.domain.Author;
import com.codewithsuhel.database.repositories.AuthorRepositories;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class AuthorServices {

    AuthorRepositories repositories;

    public AuthorServices(AuthorRepositories authorRepositories) {
        this.repositories = authorRepositories;
    }

    public Iterable<Author> getAllAuthors() {
        return repositories.findAll();
    }

    public Author addAuthor(Author author) {
        return repositories.save(author);
    }

    public Author updateAuthor(Long id, Author author) {
        return repositories.findById(id).map(authorDetails -> {
            authorDetails.setAge(author.getAge());
            authorDetails.setName(author.getName());
            return repositories.save(authorDetails);
        }).orElseThrow(() -> new RuntimeException("author not found id: " + id));
    }

    public Author deleteAuthor(Long id) {
        Author author = repositories.findById(id).orElseThrow(() -> new RuntimeException("Author not found id: " + id));
        repositories.deleteById(id);
        return author;
    }

}
