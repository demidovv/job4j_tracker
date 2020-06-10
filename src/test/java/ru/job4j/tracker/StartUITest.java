package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {

        String[] answers = {"One", "Two", "Three", "Four"};
        int numbers = answers.length;
        Input input = new StubInput(answers);

        Tracker tracker = new Tracker();
        for (int i = 0; i < numbers; i++) {
            StartUI.createItem(input, tracker);
        }

        Item[] created = tracker.findAll();
        for (int i = 0; i < numbers; i++) {
            assertThat(created[i].getName(), is(answers[i]));
        }
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
        };
        StartUI.deteleItem(new StubInput(answers), tracker);
        Item excepted = null;
        assertThat(tracker.findById(item.getId()), is(excepted));
    }
}

