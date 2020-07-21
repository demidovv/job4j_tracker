package ru.job4j.collection;

import ru.job4j.tracker.StubOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (Object name: names) {
            System.out.println(name);
        }
    }
}
