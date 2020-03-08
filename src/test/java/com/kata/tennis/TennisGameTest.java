package com.kata.tennis;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
    private TennisGame tennisGame;

    @Before
    public void initializeBowlingObj(){
        tennisGame = new TennisGame();
    }

    @Test
    public void shouldReturnLoveAllAtStartOfNewGame()
    {
        Assert.assertEquals("Love All", tennisGame.getResult());
    }

    @Test
    public void shouldReturnFifteenLoveWhenPlayerOneScores()
    {
        tennisGame.playerOneScores();
        Assert.assertEquals("Fifteen, Love", tennisGame.getResult());
    }
}
