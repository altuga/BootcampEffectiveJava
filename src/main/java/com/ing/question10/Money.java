package com.ing.question10;


import java.math.BigDecimal;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 * Twitter : @altugaltintas
 */

/*
TODO:
 1 - Show presentation in order to understand the question well - http://tiny.cc/cnrccz
 2 - Run the app.
 3 - Any abnormality ? If yes try fix it - 5 mins
 4 - Instructor will show the solutions
 5 - Refactor and ask questions
*/

public class Money {

    public static void main(String[] args) {
        BigDecimal funds = new BigDecimal("1.00");
        BigDecimal NOTZERO = new BigDecimal("0.10");
        int itemsBought = 0;
        for (BigDecimal price = NOTZERO; funds.compareTo(price) >= 0;
             price= price.add(NOTZERO) ) {
             funds = funds.subtract(price) ;
             itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
