package org.example.s31641tpo04books.entities;

import jakarta.persistence.*;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person_id;

    public Publisher(Person person_id) {
        this.person_id = person_id;
    }

    public Publisher(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Person person_id) {
        this.person_id = person_id;
    }
}
