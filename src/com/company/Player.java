package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private String playerOne = "";
    private String playerTwo = "";
    private ArrayList<Card> deckOfCards;
    int turn = 0;


    public Player(String name, ArrayList<Card> deck, String playerOne, String playerTwo) {
        this.name = name;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.deckOfCards = deck;
    }

    //Determines which turn of player
    public String getPlayerTurn(int i) {
        String isPlayerTurn = "";
        if (i % 2 == 0) {
            isPlayerTurn = playerOne;
            return (playerOne);
        } else {
            isPlayerTurn = playerTwo;
            return (playerTwo);
        }
    }


    public String startGame() {
        Scanner readInput = new Scanner(System.in);
        String enterKey;
        Card previousCard;
        Card currentCard;
        boolean isWin;
        String isPlayerTurn = "";
        System.out.println("The game is " + name.toLowerCase() + "...");
        for (int i = 0; i < 52; i++) {
            getPlayerTurn(i);
            //On even turns print player one your turn
            if (i % 2 == 0) {
                isPlayerTurn = playerOne;
                System.out.println(playerOne + " your turn! Press enter");
            } else {
                // On odd print player two turn
                isPlayerTurn = playerTwo;
                System.out.println(playerTwo + " your turn! Press enter");
            }
            enterKey = readInput.nextLine();
            enterKey.equals("");
            previousCard = deckOfCards.get(turn);
            turn++;
            currentCard = deckOfCards.get(turn);
//            isWin = checkForWin(previousCard, currentCard);
//            if (isWin) {
//                return previousCard.toString() + " Next card: " + currentCard.toString() + isPlayerTurn + ", you win!";
//            } else {
//                System.out.println(previousCard.toString() + " Next card: " + currentCard.toString() + " It's not a match!");
//            }
        }
        return "It's a draw";
    }
}
