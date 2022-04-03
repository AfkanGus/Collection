package ru.job4j;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    /**
     * void add(int index, E e) -добавление элемента по индексу.
     * boolean contains(E e) - метод проверяет содержит список элемент Е
     */
    public static boolean addNewElement(List<String> list, int index, String string) {
        List<String> check = new ArrayList<>(list);
        for (String s : list) {
            if (!string.contains(s)) {
                check.add(index, string);
            } else {
                return false;
            }
        }
        return check.size()  != list.size();
    }
}
