package org.openbiblio.biblio.core.catalogue;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Book {
    private @Id @GeneratedValue Integer id;
    private String title;
    private @ManyToOne(fetch = FetchType.LAZY) Author author;
    private String summary;
    private Integer year;
    private String isbn;
    private Integer unitsAvaiable;

    protected Book() {}

    public Book(String title, Author author, String summary, Integer year, String isbn, Integer unitsAvaiable) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.year = year;
        this.isbn = isbn;
        this.unitsAvaiable = unitsAvaiable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getUnitsAvaiable() {
        return unitsAvaiable;
    }

    public void setUnitsAvaiable(Integer unitsAvaiable) {
        this.unitsAvaiable = unitsAvaiable;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
