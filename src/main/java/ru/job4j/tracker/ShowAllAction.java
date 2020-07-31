package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
//        Item[] all = tracker.findAll();
//        for (int i = 0; i < all.length; i++) {
//            out.println(i + 1 + all[i].toString());
//        }
        ArrayList<Item> all = tracker.findAll();
        int i = 0;
        for (Item item : all) {
            out.println(i + 1 + item.toString());
            i++;
        }
        return true;
    }
}
