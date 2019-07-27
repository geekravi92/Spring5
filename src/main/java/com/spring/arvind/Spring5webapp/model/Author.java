package com.spring.arvind.Spring5webapp.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Author
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public Author(String fName, String lName, Set<Book> books) {
        this.firstName = fName;
        this.lastName = lName;
        this.books = books;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    /**
     * @return the books
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='" + getLastName()
                + "'" + ", books='" + getBooks() + "'" + "}";
    }

}