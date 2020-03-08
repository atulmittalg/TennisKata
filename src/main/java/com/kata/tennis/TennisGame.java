package com.kata.tennis;

import java.util.HashMap;

import static com.kata.tennis.constants.ScoreConstants.*;

public class TennisGame
{

    private Player firstPlayer;
    private Player secondPlayer;


    public void setPlayers(Player firstPlayer, Player secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getResult() {
        if(firstPlayer.getPlayerScore() == FIFTEEN && secondPlayer.getPlayerScore() == LOVE)
            return "Fifteen, Love";
        if(firstPlayer.getPlayerScore() == LOVE && secondPlayer.getPlayerScore() == FIFTEEN)
            return "Love, Fifteen";
        if(firstPlayer.getPlayerScore() == THIRTY && secondPlayer.getPlayerScore() == LOVE)
            return "Thirty, Love";
        if(firstPlayer.getPlayerScore() == secondPlayer.getPlayerScore())
            return scoreValues.get(firstPlayer.getPlayerScore()) + " All";
        return "Love All";
    }
}