package com.ing.question12;


import java.util.*;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 *
 * Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Symptom {

    static Collection<Card.Suit> suits = Arrays.asList(Card.Suit.values());
    static Collection<Card.Rank> ranks = Arrays.asList(Card.Rank.values());
    static List<Card> deck = new ArrayList<>();

    public static void main(String[] args) {


        List<Card> deck = new ArrayList<>();

        for (Iterator<Card.Suit> i = suits.iterator(); i.hasNext(); )
            for (Iterator<Card.Rank> j = ranks.iterator(); j.hasNext(); )
                deck.add(new Card(i.next(), j.next()));

        
    }
}
