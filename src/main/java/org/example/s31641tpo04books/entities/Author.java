package org.example.s31641tpo04books.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person_id;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();
}
