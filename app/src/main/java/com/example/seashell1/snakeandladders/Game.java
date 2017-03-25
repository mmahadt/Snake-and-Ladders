package com.example.seashell1.snakeandladders;

import android.util.Log;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Game {
    Board B1 = new Board();
    Player P1 = new Player();
    Player P2 = new Player();
    Dice Dice = new Dice();

    private static final String TAG = "GameClass";

    public void start() {
        while (true) {
            if (P1.getPosition() == 100 || P1.getPosition() >= 10) {
                Log.i(TAG, "P1 has won");
                break;
            } else if (P2.getPosition() == 100 || P2.getPosition() >= 10) {
                Log.i(TAG, "P2 has won");
                break;
            } else {
                //P1's turn
                P1.takeTurn();

                //P2's turn
                P2.takeTurn();
            }
        }
    }
}
