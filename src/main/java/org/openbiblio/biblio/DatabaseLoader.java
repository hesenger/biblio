package org.openbiblio.biblio;

import org.openbiblio.biblio.core.catalogue.Author;
import org.openbiblio.biblio.core.catalogue.AuthorRepository;
import org.openbiblio.biblio.core.catalogue.Book;
import org.openbiblio.biblio.core.catalogue.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final AuthorRepository authors;
    private final BookRepository books;

    @Autowired
    public DatabaseLoader(AuthorRepository authors, BookRepository books) {
        this.authors = authors;
        this.books = books;
    }

    @Override
    public void run(String... args) throws Exception {
        Author assis = authors.save(new Author("ASSIS, Machado de"));

        books.save(new Book(
                "Dom Casmurro",
                assis,
                "Dom Casmurro is considered by critic Afranio Coutinho \"a true Brazilian masterpiece, and maybe Brazil's greatest representative piece of writing\" and \"one of the best books ever written in the Portuguese language, if not the best one to date\"",
                1966,
                "9780140448368",
                2));
    }
}
