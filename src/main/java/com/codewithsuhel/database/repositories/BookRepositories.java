package com.codewithsuhel.database.repositories;

import com.codewithsuhel.database.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book,String> {
}
