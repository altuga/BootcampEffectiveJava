package com.ing.question16;

import java.util.ArrayList;
import java.util.List;


/*
TODO
 1 - Run the Rawetallica app
 2 - Any abnormality ? Please try to fix it
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/

public class Rawetallica {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        add(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast
    }

    private static void add(List list, Object o) {
        list.add(o);
    }




}
