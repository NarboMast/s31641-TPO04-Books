package org.example.s31641tpo04books.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
//    @JoinTable(
//            name = "book_author", // Join table name
//            joinColumns = @JoinColumn(name = "book_id"), // Foreign key to Book
//            inverseJoinColumns = @JoinColumn(name = "author_id") // Foreign key to Author
//    )
    private List<Author> author = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="publisher")
    private Publisher publisher;

    private String title;
    private double price;

    public Book(Publisher publisher, String title, double price) {
        this.publisher = publisher;
        this.title = title;
        this.price = price;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}