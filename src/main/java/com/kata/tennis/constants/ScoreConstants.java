package com.kata.tennis.constants;

import java.util.HashMap;

public class ScoreConstants {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final HashMap<Integer, String> scoreValues = new HashMap<Integer, String>(){{
        put(LOVE, "Love");
        put(FIFTEEN, "Fifteen");
        put(THIRTY, "Thirty");
        put(FORTY, "Forty");
    }};
}
