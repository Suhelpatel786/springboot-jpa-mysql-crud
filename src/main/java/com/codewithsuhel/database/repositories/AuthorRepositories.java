package com.codewithsuhel.database.repositories;

import com.codewithsuhel.database.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositories extends CrudRepository<Author,Long> {
}
