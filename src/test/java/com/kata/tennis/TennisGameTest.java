package com.kata.tennis;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
    @Test
    public void shouldReturnLoveAllAtStartOfNewGame()
    {
        TennisGame tennisGame = new TennisGame();
        Assert.assertEquals("Love All", tennisGame.getResult());
    }
}
