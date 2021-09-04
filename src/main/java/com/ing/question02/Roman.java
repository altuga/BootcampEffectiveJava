package com.ing.question02;


/**
 * Altug Bilgin Altintas
 *
 * Effective Java Workshop
 *
 */

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**TODO
 * 1-  Measure the performance of the main() method in MICROSECONDS
 * 2 - Can you make isRomanNumeral() method faster ?
 */
public class Roman {


    private static final Pattern ROMAN = Pattern.compile(
                "^(?=.)M*(C[MD]|D?C{0,3})"
                        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
    }


    public static void main(String[] args) {
        long t1 = System.nanoTime();
        System.out.println(isRomanNumeral("MCMLXXVI"));
        long d = System.nanoTime() - t1;
        System.out.println("time " + TimeUnit.MICROSECONDS.convert(d, TimeUnit.NANOSECONDS));

    }
}
