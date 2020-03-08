package com.kata.tennis;

public class Player {
    private int playerScore;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void playerScoresPoint(){
        playerScore++;
    }
}
