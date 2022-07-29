package com.timbuchalka;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but more than 1000.");
//        } else if (score < 1000) {
//            System.out.println("Your score is less then 1000.");
//        } else {
//            System.out.println("Got here.");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
//        int scoreTwo = 10000;
//        int levelCompletedTwo = 8;
//        int bonusTwo = 200;
//
//        if(gameOver) {
//            int finalScore = scoreTwo + (levelCompletedTwo * bonusTwo);
//            System.out.println("Your final 2nd score was: " + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}