package com.company;

import java.util.Scanner;

public class Player {

    private int guesses;
    public boolean play;
    private int guess;
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

    public void PlayAgain(){
        System.out.println("Would you like to play again? (y/n) ");
        String answer = sc.next();
        play = answer.equals("y");
    }

    public void NewGuess(){
        System.out.print("Make your guess: ");
        this.setGuess(sc.nextInt());
        this.setGuesses(this.getGuesses() + 1);
    }

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
