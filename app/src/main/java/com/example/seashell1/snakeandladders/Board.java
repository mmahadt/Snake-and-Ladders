package com.example.seashell1.snakeandladders;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Board {
    int[] boxes = new int[100];

    static Snake[] snakes = {new Snake(99, 77), new Snake(90, 48), new Snake(54, 19)};

    static Ladder[] ladders = {new Ladder(9, 34), new Ladder(40, 64), new Ladder(67, 86)};

    public static boolean isSnakesMouth(int pos) {
        for (Snake snake : snakes) {
            if (snake.getMouth() == pos) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLaddersBottom(int pos) {
        for (Ladder ladder : ladders) {
            if (ladder.getBottom() == pos) {
                return true;
            }
        }
        return false;
    }

    public static int getTailOfSnakeWithMouthAt(int mouth) {
        for (Snake snake : snakes) {
            if (snake.getMouth() == mouth) {
                return snake.getTail();
            }
        }
        return 0;
    }

    public static int getTopOfLadderWithBottomAt(int bottom) {
        for (Ladder ladder : ladders) {
            if (ladder.getBottom() == bottom) {
                return ladder.getTop();
            }
        }
        return 0;
    }
}
