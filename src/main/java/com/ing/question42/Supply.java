package com.ing.question42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**TODO:
        - Throwing IOException is okay?
 */
public class Supply {

    static String firstLineOfFile(String path) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path));
    }

}
