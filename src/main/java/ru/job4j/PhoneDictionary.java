package ru.job4j;

import java.lang.reflect.Array;
import java.util.ArrayList;
/*Поиск осушествляется по всем полям.*/
public class PhoneDictionary {
    ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key) || person.getAddress().contains(key) ||
                    person.getSurname().contains(key)
                    || person.getPhone().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

}
