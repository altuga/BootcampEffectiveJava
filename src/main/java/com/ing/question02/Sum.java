package com.ing.question02;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 */

/*
TODO 
 1 - Measure the performance of the main() method in MILLISECONDS
 2 - Discussion : Did you feel any abnormality about the performance ?
 3 - Instructor will show the solutions
 4 - Refactor
*/
public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        sum();
    }
}