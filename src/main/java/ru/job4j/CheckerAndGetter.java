package ru.job4j;

import java.util.List;

/**
 * List
 * boolean isEmpty() - если коллекция пока еще
 * не содержит елеметов вернет true.
 * E get(int index)
 * size() - вернет размер коллекции
 */
public class CheckerAndGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        for (int i = 0; i < list.size(); i++) {
            if (!list.isEmpty()) {
                rsl = list.get(0);
            }
        }
        return rsl;
    }
}
