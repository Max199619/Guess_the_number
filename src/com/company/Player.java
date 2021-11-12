package com.company;

import java.util.Scanner;

public class Player {

    /**
     * number of guesses made by a player
     */
    private int guesses;
    /**
     * checks if the user still wants to play
     */
    public boolean play;
    /**
     * a number input by a player as a guess
     */
    private int guess;
    /**
     * class used to get the player's input
     */
    public Scanner sc = new Scanner(System.in);

    public Player(){
        guesses = 0;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    /**
     * Lets player decide if player wants to play again, by giving input
     */
    public void PlayAgain(){
        System.out.println("Would you like to play again? (y/n) ");
        String answer = sc.next();
        play = answer.equals("y");
    }

    /**
     * Takes user input, sets it as player's guess and increments
     * the number of player's guesses
     */
    public void NewGuess(){
        System.out.print("Make your guess: ");
        this.setGuess(sc.nextInt());
        this.setGuesses(this.getGuesses() + 1);
    }

    /**
     * @param randNum - random number created in the main class
     * @return correct - is the guess made by player correct
     */
    public boolean CheckGuess(int randNum){
        boolean correct;
        if (this.getGuess() == randNum){
            correct = true;
            System.out.println("You guessed correctly after " + this.getGuesses() + " guesses");
        }
        else{
            if (this.getGuess() < randNum){
                System.out.println("Your number is too low");
            }
            else{
                System.out.println("Your number is too high");
            }
            correct = false;
        }
        return correct;
    }

}
