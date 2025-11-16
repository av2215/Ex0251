package com.example.ex0251.targil2;

public class Cat extends Animal implements Runnable{

    @Override
    public void makeSound() {
        System.out.println("meaw");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void run() {
        System.out.println("run for catch mouse");
    }
}
