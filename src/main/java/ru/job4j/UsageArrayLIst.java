package ru.job4j;

import java.util.ArrayList;

public class UsageArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> aLi = new ArrayList<>();
        aLi.add("P");
        aLi.add("t");
        aLi.add("i");
        for (String s : aLi) {
            System.out.println(s);
        }
    }
}
