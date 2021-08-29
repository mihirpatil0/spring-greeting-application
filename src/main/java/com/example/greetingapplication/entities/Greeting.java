package com.example.greetingapplication.entities;

public class Greeting {
    private final long id;
    private final String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
