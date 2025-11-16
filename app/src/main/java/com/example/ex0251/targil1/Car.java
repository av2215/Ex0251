package com.example.ex0251.targil1;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("give more gas in car");
    }

    @Override
    public void start() {
        System.out.println("start drive the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car right now!!!!!!!!");
    }
}
