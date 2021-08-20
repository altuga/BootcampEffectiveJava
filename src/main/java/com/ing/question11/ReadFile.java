package com.ing.question11;

import java.io.*;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 *
 * Twitter : @altugaltintas
 */


/*
TODO: 
 1 - Ugly code please simplify the code -  5 mins
 2 - Instructor will show the solutions
 3 - Refactor and ask questions 
*/
public class ReadFile {

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path));
    }
}
