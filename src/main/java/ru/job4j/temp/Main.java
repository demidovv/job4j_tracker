package ru.job4j.temp;

import java.util.Arrays;

public class Main {

    public static Film[] film = new Film[5];

    public static void main(String[] args) {

        film[0] = new Film("Title 1", 2000);
        film[1] = new Film("Title 2", 2001);
        film[2] = new Film("Title 3", 2002);
        film[3] = new Film("Title 4", 2003);
        film[4] = new Film("Title 5", 2004);

        Arrays.sort(film, new TitleComparator(false));
        for (Film f : film) {
            System.out.println(f.getTitle());
        }
    }
}