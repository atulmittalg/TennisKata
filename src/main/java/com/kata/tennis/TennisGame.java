package com.kata.tennis;

/**
 * Hello world!
 *
 */
public class TennisGame
{
    private Player firstPlayer;
    private Player secondPlayer;

    public void setPlayers(Player firstPlayer, Player secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getResult() {
        if(firstPlayer.getPlayerScore() == 1 && secondPlayer.getPlayerScore() == 0) return "Fifteen, Love";
        else if(secondPlayer.getPlayerScore() == 1 && firstPlayer.getPlayerScore() == 0) return "Love, Fifteen";
        else if(firstPlayer.getPlayerScore() == 1 && secondPlayer.getPlayerScore() == 1) return "Fifteen All";
        else if(firstPlayer.getPlayerScore() == 2 && secondPlayer.getPlayerScore() == 0) return "Thirty Love";
        else return "Love All";
    }
}