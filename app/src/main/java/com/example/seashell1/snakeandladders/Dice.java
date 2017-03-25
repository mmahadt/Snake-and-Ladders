package com.example.seashell1.snakeandladders;

import java.util.Random;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Dice {
    private static int outcome = 0;
    private static int High = 7;
    private static int Low = 1;

    Dice() {//Default Dice constructor sets outcome as 0
        outcome = 0;
    }

    public static int roll() {
        Random r = new Random();
        outcome = r.nextInt(High - Low) + Low;
        return outcome;
    }
}
