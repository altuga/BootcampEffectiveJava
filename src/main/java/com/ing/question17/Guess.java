package com.ing.question17;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/*
TODO
 1 - Run the Guess app
 2 - Any abnormality ? Please try to fix it
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/

public class Guess {
    private final Object[] choiceArray;

    public Guess(Collection choices) {
        choiceArray = choices.toArray();
    }
    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        List<String> stringList = List.of("one", "two", "three", "four", "five", "six");

        Guess guess = new Guess(intList);

        for (int i = 0; i < 10; i++) {
            String choice = (String) guess.choose();
            System.out.println(choice);
        }

        guess = new Guess(stringList);

        for (int i = 0; i < 10; i++) {
            String choice = (String) guess.choose();
            System.out.println(choice);
        }

    }
}
