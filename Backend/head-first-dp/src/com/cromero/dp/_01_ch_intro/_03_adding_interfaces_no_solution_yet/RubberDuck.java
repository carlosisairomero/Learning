package com.cromero.dp._01_ch_intro._03_adding_interfaces_no_solution_yet;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Rubber duck squeaking");
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck!");
    }
}
