package ru.job4j.temp;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args){
        List<Message> messages = new ArrayList();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        System.out.println(messages);
    }
}
