package com.ing.question32;

import java.util.Iterator;
import java.util.List;

/*
TODO
 1 - Run the LordOfTheLoops.java
 2 - Did you spot the bug?
*/
public class LordOfTheLoops {

    public static void exec(List<String> n, List<Integer> a) {
        Iterator<String> i = n.iterator();
        while (i.hasNext()) {
            System.out.println(" --> " + i.next() );
        }

        Iterator<Integer> i2 = a.iterator();
        while (i.hasNext()) {
            System.out.println(" --> " + i2.next());
        }
    }

    public static void main(String[] args) {

        List<String> names = List.of("Lurtz", "Saruman" , "Gollum" , "Boromir" , "Legolas");
        List<Integer> ages  = List.of(40, 50, 160, 65, 1040);

        exec(names, ages);

    }

}
