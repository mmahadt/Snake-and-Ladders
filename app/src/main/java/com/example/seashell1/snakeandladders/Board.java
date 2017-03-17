package com.example.seashell1.snakeandladders;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Board {
    int[] boxes = new int[100];
    Snake[] snakes = {new Snake(99, 77), new Snake(90, 48), new Snake(54, 19)};
    Ladder[] ladders = {new Ladder(9, 34), new Ladder(40, 64), new Ladder(67, 86)};
}
