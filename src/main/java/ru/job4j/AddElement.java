package ru.job4j;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String string) {
        List<String> check = new ArrayList<>(list);
        if (check.size() == list.size()) {
            return list.add(string);
        }
        return false;
    }

}
