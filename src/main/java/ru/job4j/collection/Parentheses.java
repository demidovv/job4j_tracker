package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data.length %2 == 0 && data.length != 0 && data[0] == '(') {
            int open = 0;
            int close =0;
            for (char symbol: data) {
                if (symbol == '(') {
                    open++;
                } else if (symbol == ')') {
                    close++;
                } else {
                    return false;
                }
            }
            if (open == close) {
                return true;
            }
        }
        return false;
    }
}