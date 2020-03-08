package com.kata.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest
{
    private TennisGame tennisGame;
    private Player firstPlayer;
    private Player secondPlayer;

    @Before
    public void initializeBowlingObj(){
        tennisGame = new TennisGame();
        firstPlayer = new Player();
        secondPlayer = new Player();
    }

    @Test
    public void shouldReturnLoveAllAtStartOfNewGame()
    {
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Love All", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenLoveWhenPlayerOneScores()
    {
        firstPlayer.playerScoresPoint();
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Fifteen, Love", tennisGame.getResult());
    }

    @Test
    public void shouldReturnLoveFifteenWhenPlayerTwoScoresFirst()
    {
        secondPlayer.playerScoresPoint();
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Love, Fifteen", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenAllWhenBothPlayersScorePointEach(){
        firstPlayer.playerScoresPoint();
        secondPlayer.playerScoresPoint();
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Fifteen All", tennisGame.getResult());
    }
}
