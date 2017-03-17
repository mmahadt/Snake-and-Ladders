package com.example.seashell1.snakeandladders;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Ladder {

    private int
            top,
            bottom;

    Ladder() {//ctr sets values of mouth and tail
        top = 0;
        bottom = 0;
    }

    public Ladder(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }
}
