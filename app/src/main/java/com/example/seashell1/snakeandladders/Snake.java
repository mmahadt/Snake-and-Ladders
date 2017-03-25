package com.example.seashell1.snakeandladders;

import java.util.ArrayList;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Snake {

    private int
            mouth,
            tail;

    Snake() {//ctr sets values of mouth and tail
        mouth = 0;
        tail = 0;
    }

    public Snake(int mouth, int tail) {
        this.mouth = mouth;
        this.tail = tail;
    }

    public int getMouth() {
        return mouth;
    }

    public int getTail() {
        return tail;
    }
}
