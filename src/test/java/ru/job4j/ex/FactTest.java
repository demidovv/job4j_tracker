package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentIsNesative() {
        Fact.calc(-9);
    }

    @Test
    public void whenArgument8() {
        int result = Fact.calc(8);
        assertThat(result, is(40320));
    }

    @Test
    public void whenArgument0() {
        int result = Fact.calc(0);
        assertThat(result, is(1));
    }
}