package com.Farahnaz.model;


import java.util.UUID;
import java.time.LocalDateTime;

public class User {
    //-------------------------- properties declaration-------------------------

    private final UUID id;               // unique ID
    private final String email;          // user email
    private final String passwordHash;   //passwordHash
    private final LocalDateTime createdAt; // create Date and time by using time of user

    //------------------------------------------------------------------------------

    // Constructor
    public User(String email, String passwordHash) {
        this.id = UUID.randomUUID();         // caret unique ID
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdAt = LocalDateTime.now(); // current time
    }
    //-------------------------------------------------------------------------------------

    // Getters
    public UUID getId() { return id; }
    public String getEmail() { return email; }
    public String getPasswordHash() { return passwordHash; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}

