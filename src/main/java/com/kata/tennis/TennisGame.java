package com.kata.tennis;

/**
 * Hello world!
 *
 */
public class TennisGame
{
    private int playerOneScore;

    public String getResult() {
        if(playerOneScore == 1) return "Fifteen, Love";
        else return "Love All";
    }

    public void playerOneScores() {
        playerOneScore++;
    }
}
