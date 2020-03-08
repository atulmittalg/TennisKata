package com.kata.tennis;

import static com.kata.tennis.constants.ScoreConstants.FORTY;
import static com.kata.tennis.constants.ScoreConstants.scoreValues;

public class TennisGame {

    private Player firstPlayer;
    private Player secondPlayer;


    public void setPlayers(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getResult() {
        int firstPlayerScore = firstPlayer.getPlayerScore();
        int secondPlayerScore = secondPlayer.getPlayerScore();
        if (firstPlayerScore == secondPlayerScore && firstPlayerScore >= FORTY)
            return "Deuce";
        if (firstPlayerScore == secondPlayerScore)
            return scoreValues.get(firstPlayerScore) + " All";
        if (isAdvantantage(firstPlayerScore, secondPlayerScore))
            return "Advantage Player 1";
        if (isAdvantantage(secondPlayerScore, firstPlayerScore))
            return "Advantage Player 2";
        return scoreValues.get(firstPlayerScore) + ", " + scoreValues.get(secondPlayerScore);
    }

    private boolean isAdvantantage(int firstPlayerScore, int secondPlayerScore) {
        return firstPlayerScore > secondPlayerScore && firstPlayerScore > FORTY;
    }
}