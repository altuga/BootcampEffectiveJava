package com.ing.question03;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 * Twitter : @altugaltintas
 */


/*
TODO:
 1 - Story : Let’s assume that rooms must be cleaned before they are reclaimed.
 2 - How do you clean the Room - Create Room and clean numJunkPiles - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/

public class Adult {
    public static void main(String[] args) {

        try(Room room = new Room(10)){
            System.out.println("Temizlik basliyorrrr"); // clean numJunkPiles to zero
        };


        //Clean the room automagically



    }
}
