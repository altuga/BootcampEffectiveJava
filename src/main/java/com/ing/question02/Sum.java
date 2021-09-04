package com.ing.question02;


import java.util.concurrent.TimeUnit;

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
        long sum = 0L;
        // int , double, long, float, short, boolean, char, byte
        // Integer, Double Long, Float, Short, Boolean, Char, Byte

        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i; // autoboxing
        return sum;
    }

    public static void main(String[] args) {

        long start = System.nanoTime(); // always use nanotTime for accuracy
        sum();
        long end = System.nanoTime();
        System.out.println(  TimeUnit.MILLISECONDS.convert( (end - start), TimeUnit.NANOSECONDS) +  " ms..");



    }
}