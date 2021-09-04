package com.ing.question05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 */

/*
TODO: 
 1 - Run the app like this ex: java Sort Istanbul Tokyo
 2 - Sort the words according to length() of the String
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Sort {

    // Sort according to lenght of the String
    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);
        System.out.println(words);

        // Anonymous class instance as a function object - obsolete!
        /*
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });*/


        // Lambda expression as function object (replaces anonymous class)
        //Collections.sort(words,
         //       (s1, s2) -> Integer.compare(s1.length(), s2.length()));


        // Collections.sort(words, comparingInt(String::length));

        words.sort(comparingInt(String::length));

        System.out.println(words);
    }
}
