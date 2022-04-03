package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Af", "Gus", "123", "asd"));
        ArrayList<Person> persons = phones.find("Af");
        assertThat(persons.get(0).getSurname(), is("Gus"));
    }
}