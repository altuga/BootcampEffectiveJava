package com.ing.question31;

import java.util.*;

/*
TODO
 1 - Run the Max.java
 2 - Is this the best way for max() method?
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/
public class Max {


    // Returns maximum value in collection - throws exception if empty
    public static String max(Collection<String> collection) {
        if (collection == null || collection.isEmpty())
            throw new IllegalArgumentException("Empty collection");

        String result = null;
        for (String e : collection) {
            if (result == null || result.compareTo(e) > 0)
                result = Objects.requireNonNull(e);
        }


        return  result;
    }



    public static void main(String[] args) {
        List<String> words = Arrays.asList("100", "20", "5");

        System.out.println(max(words));


    }
}
