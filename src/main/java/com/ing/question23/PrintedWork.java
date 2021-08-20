package com.ing.question23;

public class PrintedWork {

    public static final int STYLE_BOLD = 1 ;
    public static final int STYLE_ITALIC = 2 ;
    public static final int STYLE_UNDERLINE = 4 ;
    public static final int STYLE_STRIKETHROUGH = 8 ;
    // Parameter is bitwise OR of zero or more STYLE_ constants
    public void applyStyles(int styles) {
        System.out.println( styles + " are applied ");
    }
}
