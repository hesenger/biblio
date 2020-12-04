package org.openbiblio.biblio.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    private @Id @GeneratedValue Integer id;
    private String username;
    private String fullName;
    private String password;
    private boolean isActive;

    protected User() { }


}
