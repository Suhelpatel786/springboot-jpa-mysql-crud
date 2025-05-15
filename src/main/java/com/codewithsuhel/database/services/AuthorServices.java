package com.codewithsuhel.database.services;

import com.codewithsuhel.database.domain.Author;
import com.codewithsuhel.database.repositories.AuthorRepositories;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class AuthorServices {

    AuthorRepositories repositories;

    public AuthorServices(AuthorRepositories authorRepositories){
        this.repositories = authorRepositories;
    }

    public Iterable<Author> getAllAuthors(){
        return repositories.findAll();
    }

    public Author addAuthor(Author author){
        return repositories.save(author);
    }

}
