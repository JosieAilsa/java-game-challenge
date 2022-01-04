package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Snap extends CardGame {
    private ArrayList<Card> deckOfCards;
    String playerOne = "";
    String playerTwo = "";

    public Snap(ArrayList<Card> deck, String playerOne, String playerTwo) {
        super("snap", deck);
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.deckOfCards = deck;
    }

    public String getPlayerTurn(int i) {
        String isPlayerTurn = "";
        //On even turns print player one your turn
        if (i % 2 == 0) {
            return isPlayerTurn = playerOne;
        } else {
            // On odd print player two turn
            return isPlayerTurn = playerTwo;
        }
    }

    // Why doe static final work but not static
    public boolean isMatch(Card first, Card second) {
        return first.getValue() == second.getValue();
    }

    //Name to run game
    public String runGame() {
        // 1. Initialise the game, use the scanner to get the name
        Scanner readInput = new Scanner(System.in);
        System.out.println("The game is " + this.getName().toLowerCase() + " press enter to play.");

        for (int i = 0; i < 51; i++) {
            // 1. Wait for the enter key to be pressed
            readInput.nextLine();
            // Do we need to check for an empty string?
            Card previousCard = deckOfCards.get(i);
            Card currentCard = deckOfCards.get(i + 1);

            if (isMatch(previousCard, currentCard)) {
                System.out.println(previousCard.toString() + " Next card: " + currentCard.toString() + getPlayerTurn(i) + ".You have 5 seconds to type, hit enter to win the game!");
                return handleMatch(i);
            } else {
                System.out.println(previousCard.toString() + " Next card: " + currentCard.toString() + " It's not a match!");
            }
        }

        return "It's a draw";
    }

    public String handleMatch(int currentTurn) {
        TimerUtils timer = new TimerUtils(5, new Timer());
        Scanner scanSnap = new Scanner(System.in);
        String winningPlayer = getPlayerTurn(currentTurn);

        timer.startTimer();
        String userInput = scanSnap.nextLine().toLowerCase();
        timer.cancelTimer();

        if (userInput.equals("snap") && timer.getTimeRemaining() != 0) {
            return winningPlayer + " you win!";
        }

        return "Sorry too slow, keep playing";
    }

}
