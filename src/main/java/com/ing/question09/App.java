package com.ing.question09;

import java.util.Date;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 * Twitter : @altugaltintas
 */


/*
TODO
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class App 
{
    public static void main( String[] args )
    {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        System.out.println(p.end());
        end.setYear(78); // Modifies internals of p!
        System.out.println(p.end());
    }
}
