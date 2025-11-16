package com.example.ex0251.targil2;

public class Bird extends Animal implements Flyable{

    @Override
    public void makeSound() {
        System.out.println("kaaa kaaa");
    }

    @Override
    public void eat() {
        System.out.println("kernels");
    }

    @Override
    public void fly() {
        System.out.println("fly for catch worm");
    }
}
