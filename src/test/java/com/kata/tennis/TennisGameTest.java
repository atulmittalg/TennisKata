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
        setPlayerScores(1,0);
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Fifteen, Love", tennisGame.getResult());
    }

    @Test
    public void shouldReturnLoveFifteenWhenPlayerTwoScoresFirst()
    {
        setPlayerScores(0,1);
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Love, Fifteen", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenAllWhenBothPlayersScorePointEach(){
        setPlayerScores(1,1);
        tennisGame.setPlayers(firstPlayer, secondPlayer);
        assertEquals("Fifteen All", tennisGame.getResult());
    }

    private void setPlayerScores(final int  firstPlayerPoints, final int sceondPlayerPoints){
        int i = 0;
        for(; i<firstPlayerPoints; i++){
            firstPlayer.playerScoresPoint();
        }
        for(i=0; i<sceondPlayerPoints; i++){
            secondPlayer.playerScoresPoint();
        }
    }
}
