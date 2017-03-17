package com.example.seashell1.snakeandladders;

import java.util.Random;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Dice {
    private int outcome;
    int Low = 1;
    int High = 7;

    Dice() {//Default Dice constructor sets outcome as 0
        outcome = 0;
    }

    public void roll(){
        Random r = new Random();
        outcome = r.nextInt(High-Low) + Low;
    }

    public int getOutcome() {//a wrapper function of Dice roll
        roll();//roll the dice and then return outcome
        return outcome;
    }
}
