package com.ing.question43;

import java.io.File;

public class IllegalArgumentExceptionExample {

    /**
     *
     * @param parent, The path of the parent node.
     * @param filename, The filename of the current node.
     * @return The relative path to the current node, starting from the parent node.
     * @throws IllegalArgumentException in case of null
     */
    public static String createRelativePath(String parent, String filename) {
        if(parent == null)
            throw new IllegalArgumentException("The parent path cannot be null!");

        if(filename == null)
            throw new IllegalArgumentException("The filename cannot be null!");

        return parent + File.separator + filename;
    }

    public static void main(String[] args) {
        // The following command will be successfully executed.
        System.out.println(IllegalArgumentExceptionExample.createRelativePath("dir1", "file1"));
        System.out.println();

        // The following command throws an IllegalArgumentException.
        System.out.println(IllegalArgumentExceptionExample.createRelativePath(null, "file1"));
    }
}