package com.ing.question30;

import java.util.List;

/*
TODO

 1 - What improvements can be made to this class ?
 2 - What is the lesson  ?
*/
public class Main {

    public static void main(String[] args) {

        CheeseController shop = new CheeseController();

        List<Cheese> cheeses = shop.getCheeses();
        if (cheeses != null && cheeses.contains(Cheese.Name.STILTON))
            System.out.println("Jolly good, just the thing.");

    }
}
