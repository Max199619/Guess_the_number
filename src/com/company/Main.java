package com.company;

import java.util.Random;

public class Main {

    /**
     * random number, which player aims to guess
     */
    public static int randNum;
    /**
     * did the player guess correctly?
     */
    public static boolean correctGuess;

    public static void main(String[] args){
        // New player starts a game
        Player player = new Player();
        player.play = true;
        //Repeat until Player says, he doesn't want to play again
        while (player.play){
            //Creating new Random number
            NewRandom();
            /*
            When a new random number is created, the variable, checking
            if the input is correct is set to false - incorrect, as a prime
            point
             */
            correctGuess = false;
            //Repeat until the Player guesses correctly
            while (!correctGuess){
                player.NewGuess();
                correctGuess = player.CheckGuess(randNum);
            }

            player.PlayAgain();

        }

    }


    /**
     * Creates a random number in range 1-100 (inclusive)
     */
    public static void NewRandom(){
        Random rand = new Random();
        randNum = rand.nextInt(100);
    }
}
