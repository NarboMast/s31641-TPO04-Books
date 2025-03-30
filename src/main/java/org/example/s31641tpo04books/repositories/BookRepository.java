package org.example.s31641tpo04books.repositories;


import org.example.s31641tpo04books.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}

