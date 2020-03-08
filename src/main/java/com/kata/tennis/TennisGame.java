package com.kata.tennis;

/**
 * Hello world!
 *
 */
public class TennisGame
{
    private int playerOneScore;
    private int playerTwoScore;

    public String getResult() {
        if(playerOneScore == 1) return "Fifteen, Love";
        else if(playerTwoScore == 1) return "Love, Fifteen";
        else return "Love All";
    }

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}
