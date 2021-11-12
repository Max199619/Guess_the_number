package com.company;

import java.util.Random;

public class Main {

    public static int randNum;
    public static boolean correctGuess;

    public static void main(String[] args){
        Player player = new Player();
        player.play = true;
        while (player.play){
            NewRandom();
            correctGuess = false;
            while (!correctGuess){
                player.NewGuess();
                correctGuess = player.CheckGuess(randNum);
            }

            player.PlayAgain();

        }

    }


    public static void NewRandom(){
        Random rand = new Random();
        randNum = rand.nextInt(100);
    }
}
