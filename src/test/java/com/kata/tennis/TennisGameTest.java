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
        setPlayerScores(0,0);
        assertEquals("Love All", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenLoveWhenPlayerOneScores()
    {
        setPlayerScores(1,0);
        assertEquals("Fifteen, Love", tennisGame.getResult());
    }

    @Test
    public void shouldReturnLoveFifteenWhenPlayerTwoScoresFirst()
    {
        setPlayerScores(0,1);
        assertEquals("Love, Fifteen", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenAllWhenBothPlayersScorePointEach(){
        setPlayerScores(1,1);
        assertEquals("Fifteen All", tennisGame.getResult());
    }

    @Test
    public void shouldReturnThirtyLoveWhenPlayerOneScore2Points(){
        setPlayerScores(2,0);
        assertEquals("Thirty, Love", tennisGame.getResult());
    }

    @Test
    public void shouldReturnThirtyAllWhenBothPlayerScore2Points(){
        setPlayerScores(2,2);
        assertEquals("Thirty All", tennisGame.getResult());
    }
    @Test
    public void shouldReturnFortyLoveWhenPlayerOneScore3Points(){
        setPlayerScores(3,0);
        assertEquals("Forty, Love", tennisGame.getResult());
    }

    @Test
    public void shouldReturnDeuceWhenBothPlayersScore3Points(){
        setPlayerScores(3,3);
        assertEquals("Deuce", tennisGame.getResult());
    }

    @Test
    public void shouldReturnAdvantagePlayer1WhenPlayer1ScoresPointAfterDeuce(){
        setPlayerScores(4,3);
        assertEquals("Advantage Player 1", tennisGame.getResult());
    }

    @Test
    public void shouldReturnAdvantagePlayer2WhenPlayer2ScoresPointAfterDeuce(){
        setPlayerScores(3,4);
        assertEquals("Advantage Player 2", tennisGame.getResult());
    }

    @Test
    public void shouldReturnWinnerPlayer1WhenPlayer1Scores2PointsMoreThanPlayer2(){
        setPlayerScores(4,1);
        assertEquals("Winner Player 1", tennisGame.getResult());
    }

    @Test
    public void shouldReturnWinnerPlayer2WhenPlayer2Scores2PointsMoreThanPlayer1(){
        setPlayerScores(4,6);
        assertEquals("Winner Player 2", tennisGame.getResult());
    }

    private void setPlayerScores(final int  firstPlayerPoints, final int sceondPlayerPoints){
        int i = 0;
        for(; i<firstPlayerPoints; i++){
            firstPlayer.playerScoresPoint();
        }
        for(i=0; i<sceondPlayerPoints; i++){
            secondPlayer.playerScoresPoint();
        }
        tennisGame.setPlayers(firstPlayer, secondPlayer);
    }
}