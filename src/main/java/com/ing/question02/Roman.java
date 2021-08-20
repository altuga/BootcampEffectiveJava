package com.ing.question02;


/**
 * Altug Bilgin Altintas
 *
 * Effective Java Workshop
 *
 */

/**
 * 1-  Measure the performance of the main() method in MICROSECONDS
 * 2 - Can you make isRomanNumeral() method faster ?
 */
public class Roman {


    private static final String ALPHA_NUMERIC_STRING = "!?&ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }




    public static void main(String[] args) {
        System.out.println(isRomanNumeral("MCMLXXVI"));
    }
}
