package com.example.seashell1.snakeandladders;

/**
 * Created by seashell1 on 3/17/2017.
 */
public class Player {
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;//pos of player on board

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean active = false;

    public Player() {
        position = 0;
    }
}
