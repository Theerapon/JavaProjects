package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score >= 1000) {
            System.out.println("Your score was less than 5000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        int outBlockFinalScore = 0;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            outBlockFinalScore = finalScore;
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println("Your out block final score was " + outBlockFinalScore);
        System.out.println();

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        int outBlockNewFinalScore = 0;
        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            outBlockNewFinalScore = finalScore;
            System.out.println("Your new final score was " + finalScore);
        }
        System.out.println("Your out block new final score was " + outBlockNewFinalScore);
        System.out.println();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            outBlockFinalScore = finalScore;
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println("Your out block final score was " + outBlockFinalScore);

    }
}
