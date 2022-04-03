package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class CheckerAndGetterTest {
    @Test
    public void whenGetNull() {
        List<String> list = new ArrayList<>();
        String rsl = CheckerAndGetter.getElement(list);
        String expected = "";
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String rsl = CheckerAndGetter.getElement(list);
        String expected = "a";
        assertThat(rsl, is(expected));
    }
}