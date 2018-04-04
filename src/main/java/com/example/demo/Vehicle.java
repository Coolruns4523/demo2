package com.example.demo;

public class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int accelerateby) {
        speed = accelerateby + speed;
    }
}
