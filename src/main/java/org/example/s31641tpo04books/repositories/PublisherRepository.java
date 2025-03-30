package org.example.s31641tpo04books.repositories;

import org.example.s31641tpo04books.entities.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
