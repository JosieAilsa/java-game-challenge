package com.company;

public class Card {
    private String suit;
    private String symbol;
    public int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "This is a " + this.symbol + " of " + this.suit + " it's worth " + this.value + ".";
    }
}
