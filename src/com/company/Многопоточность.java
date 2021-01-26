package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Многопоточность {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C", "A"));
        arrayList.remove("A");
        System.out.println(arrayList);
    }

}
