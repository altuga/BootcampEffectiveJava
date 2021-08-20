package com.ing.question36;

import java.io.*;


/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 * <p>

 * Twitter : @altugaltintas
 */


/*
TODO: 
 1 - What are the alternatives for copy() method
*/
public class ReadFile {

    private static final int BUFFER_SIZE = 8 * 1024;


    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }

        } catch (IOException ex) {
            System.err.println(ex);
            throw ex;
        }


    }

    public static void main(String[] args) throws IOException{
        String src = "a.txt"; // always gives error
        String dst = "b.txt"; // always gives error
        copy(src, dst);

    }
}
