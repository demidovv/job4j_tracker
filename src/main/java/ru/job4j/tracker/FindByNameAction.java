package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String name =  input.askStr("Enter name: ");
        Item[] find = tracker.findByName(name);
        if (find.length != 0) {
            for (int i = 0; i < find.length; i++) {
                out.println(i + 1 + find[i].toString());
            }
        }
        return true;
    }
}
