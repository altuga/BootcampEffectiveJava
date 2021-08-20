package com.ing.question19;

import java.util.HashSet;
import java.util.Set;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 2 warnings, can you spot the warnings ?
 3 - try to fix those 2 warnings.
*/
public class Combiner {

    public static Set combine(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<Integer> ages = Set.of(44, 34, 21);
        Set<String> aflCio = combine(guys, ages);
        System.out.println(aflCio);
    }
}