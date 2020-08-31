package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int len = left.length() <= right.length() ? left.length() : right.length();
        for (int i = 0; i < len; i++) {
            if (left.charAt(i) == right.charAt(i)) {
                continue;
            } else {
                return left.charAt(i) - right.charAt(i);
            }
        }

        if (left.length() != right.length()) {
            return left.length() - right.length();
        }
        return 0;
    }
}