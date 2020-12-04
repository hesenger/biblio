package org.openbiblio.biblio.core.borrow;

import org.openbiblio.biblio.core.User;
import org.openbiblio.biblio.core.catalogue.Book;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BookBorrow {
    private @Id @GeneratedValue Integer id;
    private @ManyToOne Book book;
    private @ManyToOne User user;
    private @Temporal(value = TemporalType.TIMESTAMP) Date startedAt;
    private @Temporal(value = TemporalType.TIMESTAMP) Date endsAt;
    private @Temporal(value = TemporalType.TIMESTAMP) Date returned;
    private String note;

    protected BookBorrow() { }


}
