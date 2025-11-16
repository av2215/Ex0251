package com.example.ex0251.targil2;

public class Dog extends Animal implements Runnable{

    @Override
    public void makeSound() {
        System.out.println("wuf wuf");
    }

    @Override
    public void eat() {
        System.out.println("bonzo");
    }

    @Override
    public void run() {
        System.out.println("run for catch ball");
    }
}
