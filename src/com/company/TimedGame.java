//package com.company;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;
//
//
//public class Snap extends Player {
//    public TimedGame(String name, ArrayList<Card> deck, String playerOne, String playerTwo) {
//        super(name, deck, playerOne, playerTwo);
//        this.playerOne = playerOne;
//        this.playerTwo = playerTwo;
//        this.deckOfCards = deck;
//    }
//
//    static int interval = 5;
//    static Timer timer = new Timer();
//    private String name = "Snap";
//    private String playerOne = "";
//    private String playerTwo = "";
//    private ArrayList<Card> deckOfCards;
//    private int turn;
//
//
//    @Override
//    public String startGame() {
//        Scanner readInput = new Scanner(System.in);
//        String enterKey;
//        Card previousCard;
//        Card currentCard;
//        //shuffleDeck();
//        boolean isWin;
//        String isPlayerTurn = "";
//        //System.out.println("The game is " + getName() + "...");
//        for (int i = 0; i < 52; i++) {
//            String currentPlayer = getPlayerTurn(i);
//            String currentPlayerMessage = currentPlayer + " press enter.";
//            System.out.println(currentPlayerMessage);
//            enterKey = readInput.nextLine();
//            //enterKey.equals("");
//            previousCard = deckOfCards.get(turn);
//            turn++;
//            currentCard = deckOfCards.get(turn);
//            //isWin = checkForWin(previousCard, currentCard);
//            isWin = false;
//            if (isWin) {
//                System.out.println(previousCard.toString() + " Next card: " + currentCard.toString() + isPlayerTurn + ". Type snap and hit enter to win the game!");
//                timer.scheduleAtFixedRate(new TimerTask() {
//                    public void run() {
//                        setInterval();
//                        if (interval == 0) {
//                            System.out.println("You lose too slow!");
//                        }
//                    }
//                }, 1000, 1000);
//                Scanner scanSnap = new Scanner(System.in);
//                String userInput = scanSnap.nextLine().toLowerCase();
//                if (userInput.equals("snap") && interval != 0) {
//                    timer.cancel();
//                    return currentPlayer + " you win!";
//                }
//                timer.cancel();
//                System.out.println("Sorry too slow, keep playing");
//            } else {
//                System.out.println(previousCard.toString() + " Next card: " + currentCard.toString() + " It's not a match!");
//            }
//        }
//        return "It's a draw";
//    }
//}
