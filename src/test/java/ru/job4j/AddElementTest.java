package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class AddElementTest {
    @Test
    public void whenAddElement() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        boolean rsl = AddElement.addNewElement(list, "C");
        assertThat(rsl, is(true));
    }
}