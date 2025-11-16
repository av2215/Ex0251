package com.example.ex0251.targil1;

public class Motorcycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("give more gas in motorcycle");
    }

    @Override
    public void start() {
        System.out.println("start drive the motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("stop the motorcycle right now!!!!!!!!");
    }
}
