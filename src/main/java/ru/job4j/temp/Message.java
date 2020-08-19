package ru.job4j.temp;

import java.util.Random;

public class Message {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + message;
    }

    
}
