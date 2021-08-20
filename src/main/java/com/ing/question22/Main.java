package com.ing.question22;


/**
 * TODO
 * 1 - Run the Main method , can you see "Complex algorithm is working" ?
 * 2 - Add new element (ex :  GUITARMAN)  to MusicTeam, add at the beginning
 * 3 - Run the Main method , can you see "Complex algorithm is working" ?
 * 4 - How can we sure about the position of the elements ?
 */
public class Main {

    public static void main(String[] args) {
        System.out.println( MusicTeam.DUET.numberOfMusicians());

        if (MusicTeam.DUET.numberOfMusicians() == 2) {
            System.out.println("Complex algorithm is working");
        }
    }
}
