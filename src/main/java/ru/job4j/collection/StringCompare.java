package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int len = Math.min(right.length(), left.length());
        int rsl = 0;
        for (int i = 0; i < len; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                System.out.println(rsl);
                return rsl;
            }
        }
        if (rsl == 0) {
            return Integer.compare(left.length(), right.length());
        }
        return 0;
    }
}