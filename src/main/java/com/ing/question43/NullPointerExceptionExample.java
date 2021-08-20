package com.ing.question43;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        if(args==null) {
            // In the case of a null argument IllegalArgumentException might be the more appropriate exception to throw.
            throw new NullPointerException("args is null"); // No need to do this
        }
    }

}
