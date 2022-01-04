package com.company;

import java.util.ArrayList;

public abstract class CardGame<CardGame> {
    private ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(String name, ArrayList<Card> deck) {
        this.name = name;
        this.deckOfCards = deck;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public Card dealCard() {
        return deckOfCards.get(0);
    }


    public ArrayList<Card> sortedDeckOfCards() {
        ArrayList<Card> sortedDeckOfCards = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            String symb = "";
            symb = "" + (i + 2);
            int value = i + 2;
            String[] suits = {"♤", "⃟", "♡", "♧"};
            for (int j = 0; j < suits.length; j++) {
                String currentSuit = suits[j];
                Card cardSorted = new Card(currentSuit, symb, value);
                sortedDeckOfCards.add(cardSorted);
            }
        }
        ;
        deckOfCards = sortedDeckOfCards;
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        ArrayList<Card> numbOrderDeckOfCards = new ArrayList<>();
        String[] suits = {"♤", "⃟", "♡", "♧"};
        for (int i = 0; i < suits.length; i++) {
            String currentSuit = suits[i];
            for (int j = 0; j < 13; j++) {
                String symb = "";
                symb = "" + (j + 2);
                if (j == 9) {
                    symb = "J";
                }
                if (j == 10) {
                    symb = "Q";
                }
                if (j == 11) {
                    symb = "K";
                }
                if (j == 12) {
                    symb = "A";
                }
                int val = j + 2;
                Card card = new Card(currentSuit, symb, val);
                numbOrderDeckOfCards.add(card);
            }
            ;
        }
        ;
        deckOfCards = numbOrderDeckOfCards;
        return deckOfCards;
    }


};
