package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        int open = 0;
        int close = 0;
        for (char symbol : data) {
            if (symbol == '(') {
                open++;
            } else if (symbol == ')') {
                close++;
            }
            if (open == 0 && close == 1) {
                return false;
            }
        }

        if (open == close) {
            return true;
        }
        return false;
    }
}