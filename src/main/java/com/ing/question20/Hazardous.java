package com.ing.question20;

import java.util.List;


/*
TODO
 1 - Compile Hazardous.java
 2 - There is a 1 warning, can you spot the warning ?
 3 - try to fix this 1 warning.
*/
public class Hazardous {


    static void hazardous( List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // Heap pollution
        String s = stringLists[0].get(0); // ClassCastException
    }

    public static void main(String[] args) {
        hazardous(List.of("I love JUG Istanbul and Java Day Istanbul"));
    }
}