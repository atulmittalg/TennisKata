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
            return "Advantage " + highScorePlayer(firstPlayerScore, secondPlayerScore);
        if (isWinner(firstPlayerScore, secondPlayerScore))
            return "Winner " + highScorePlayer(firstPlayerScore, secondPlayerScore);
        return scoreValues.get(firstPlayerScore) + ", " + scoreValues.get(secondPlayerScore);
    }

    private String highScorePlayer(int firstPlayerScore, int secondPlayerScore) {
        return firstPlayerScore > secondPlayerScore ? firstPlayer.getPlayerName() : secondPlayer.getPlayerName();
    }

    private boolean isWinner(int firstPlayerScore, int secondPlayerScore) {
        if(firstPlayerScore >= secondPlayerScore + 2 && firstPlayerScore > FORTY)
            return true;
        else
            return secondPlayerScore >= firstPlayerScore + 2 && secondPlayerScore > FORTY;
    }

    private boolean isAdvantantage(int firstPlayerScore, int secondPlayerScore) {
        if(firstPlayerScore == secondPlayerScore + 1 && firstPlayerScore > FORTY)
            return true;
        else
            return secondPlayerScore == firstPlayerScore + 1 && secondPlayerScore > FORTY;
    }
}