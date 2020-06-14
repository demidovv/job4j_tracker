package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        int number = -9;
        System.out.println("Факторал числа " + number + " равен " + calc(number));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument cannot be zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}