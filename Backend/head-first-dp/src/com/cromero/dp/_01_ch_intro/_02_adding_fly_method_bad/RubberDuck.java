package com.cromero.dp._01_ch_intro._02_adding_fly_method_bad;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("I'm squeaking!");
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck!");
    }
}
