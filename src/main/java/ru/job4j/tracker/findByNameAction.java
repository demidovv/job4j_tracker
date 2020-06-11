package ru.job4j.tracker;

public class findByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name =  input.askStr("Enter name: ");
        Item[] find = tracker.findByName(name);
        if (find.length != 0) {
            for (int i = 0; i < find.length; i++) {
                System.out.println(i + 1 + find[i].toString());
            }
        }
        return true;
    }
}
