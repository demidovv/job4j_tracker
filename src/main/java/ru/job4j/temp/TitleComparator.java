package ru.job4j.temp;

import java.util.Comparator;

public class TitleComparator implements Comparator<Film> {

    private boolean desc;

    public TitleComparator() {
        this(false);
    }

    public TitleComparator(boolean desc) {
        this.desc = desc;
    }

    @Override
    public int compare(Film f1, Film f2) {
        return desc ? f2.getTitle().compareTo(f1.getTitle()) :
                f1.getTitle().compareTo(f2.getTitle());
    }
}