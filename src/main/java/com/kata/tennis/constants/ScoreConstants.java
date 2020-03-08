package com.kata.tennis.constants;

import java.util.HashMap;

public class ScoreConstants {
    public static final int FORTY = 3;
    public static final HashMap<Integer, String> scoreValues = new HashMap<Integer, String>(){{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(FORTY, "Forty");
    }};
}
