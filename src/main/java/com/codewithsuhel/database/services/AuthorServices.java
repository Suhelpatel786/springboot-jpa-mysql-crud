package com.codewithsuhel.database.services;

import com.codewithsuhel.database.domain.Author;
import com.codewithsuhel.database.repositories.AuthorRepositories;
import org.springframework.stereotype.Service;

@Service
public class AuthorServices {

    AuthorRepositories repositories;

    public AuthorServices(AuthorRepositories authorRepositories){
        this.repositories = authorRepositories;
    }



}
