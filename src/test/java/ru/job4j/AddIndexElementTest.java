package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class AddIndexElementTest {
    @Test
    public void whenAddNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean resul = AddIndexElement.addNewElement(list, 1, "fourth");
        assertThat(resul, is(true));
    }

    @Test
    public void whenAddNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean resul = AddIndexElement.addNewElement(list, 1, "second");
        assertThat(resul, is(false));
    }
}