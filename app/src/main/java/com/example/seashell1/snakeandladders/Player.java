package com.example.seashell1.snakeandladders;

import android.util.Log;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Player {
    Dice D = new Dice();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;//pos of player on board

//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    private boolean active = false;

//    private static final String TAG = "PlayerClass";

    public Player() {
        position = 0;
    }

    public void takeTurn() {
        int diceOutcome = Dice.roll();

        int newPos = position + diceOutcome;//dice.roll() returns a value between 1-6 inclusive

        if (Board.isLaddersBottom(newPos)) {

            newPos = Board.getTopOfLadderWithBottomAt(newPos);

        } else if (Board.isSnakesMouth(newPos)) {

            newPos = Board.getTailOfSnakeWithMouthAt(newPos);

        }

        position = newPos;//update player's position to new position

//        if (newPos == 100) {
//            //end game
//            Log.i(TAG, "I won......" + position);
//        }

        if (diceOutcome == 6) {
            takeTurn();//recursively take another turn
        }
    }
}
