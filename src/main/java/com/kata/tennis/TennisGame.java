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
        if(firstPlayer.getPlayerScore() == secondPlayer.getPlayerScore() && firstPlayer.getPlayerScore() != FORTY)
            return scoreValues.get(firstPlayer.getPlayerScore()) + " All";
        else if (firstPlayer.getPlayerScore() == secondPlayer.getPlayerScore() && firstPlayer.getPlayerScore() == FORTY)
            return "Deuce";
        return scoreValues.get(firstPlayer.getPlayerScore()) +", "+ scoreValues.get(secondPlayer.getPlayerScore());
    }
}