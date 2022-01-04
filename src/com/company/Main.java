package com.company;

import java.util.ArrayList;

public class Main {
    private static int interval = 5;

    public static void main(String[] args) {
//         1. Get a deck of cards for us to use
        ArrayList<Card> deck = CardUtils.getUnshuffledDeck();
        // 2. Create a new game for us
        //TimedGame snapTimer = new TimedGame("Snap", deckOfCards, "Jane", "John");
        Snap game = new Snap(deck, "John", "Jane");
        // 3. Run the game and store the store
        String result = game.runGame();
        // 4. Wahoo! all done.. here's the result
        System.out.println(result);


    }


}

