package com.example.ex0251.targil1;

public class Bicycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("give more gas in bicycle");
    }

    @Override
    public void start() {
        System.out.println("start drive the bicycle");
    }

    @Override
    public void stop() {
        System.out.println("stop the bicycle right now!!!!!!!!");
    }
}
