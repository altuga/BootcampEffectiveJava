package com.ing.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 */

public final class Room implements AutoCloseable{

    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }


    @Override
    public void close()  {
        this.numJunkPiles = 0;
        System.out.println(" **** Number of Junk : s" + this.numJunkPiles);
    }
}
