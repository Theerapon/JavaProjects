package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("FAKIE", calculateHighScorePosition(1500));
        displayHighScorePosition("TIM", calculateHighScorePosition(900));
        displayHighScorePosition("MI", calculateHighScorePosition(400));
        displayHighScorePosition("FAII", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            return  finalScore;
        }
        return -1;

    }

    public  static  void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public  static  int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return  1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return  4;
        }
    }
}
