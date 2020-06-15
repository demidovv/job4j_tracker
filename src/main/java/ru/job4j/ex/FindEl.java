package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }

        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] list = {"one", "two", "three"};
        String key = "five";

        try {
            int rsl = FindEl.indexOf(list, key);
            System.out.println("Индекс элемента: " + rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}