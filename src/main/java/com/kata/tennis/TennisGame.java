package com.kata.tennis;

import java.util.HashMap;

public class TennisGame
{
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private Player firstPlayer;
    private Player secondPlayer;


    public void setPlayers(Player firstPlayer, Player secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getResult() {
        if(firstPlayer.getPlayerScore() == FIFTEEN && secondPlayer.getPlayerScore() == LOVE) return "Fifteen, Love";
        else if(firstPlayer.getPlayerScore() == LOVE && secondPlayer.getPlayerScore() == FIFTEEN) return "Love, Fifteen";
        else if(firstPlayer.getPlayerScore() == FIFTEEN && secondPlayer.getPlayerScore() == FIFTEEN) return "Fifteen All";
        else if(firstPlayer.getPlayerScore() == THIRTY && secondPlayer.getPlayerScore() == 0) return "Thirty, Love";
        else return "Love All";
    }
}