package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("add");
        collection.add("two");
        collection.add("three");
        System.out.println(collection.size());
        System.out.println(collection.contains("two"));
        System.out.println(collection.isEmpty());
        System.out.println(Arrays.toString(collection.toArray()));
    }
}
