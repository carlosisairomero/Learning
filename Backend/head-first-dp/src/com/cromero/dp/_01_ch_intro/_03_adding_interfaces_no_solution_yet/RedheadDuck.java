package com.cromero.dp._01_ch_intro._03_adding_interfaces_no_solution_yet;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("I'm a Readhead duck");
    }

    @Override
    public void fly() {
        System.out.println("Redhead duck flying");
    }

    @Override
    public void quack() {
        System.out.println("Redhead duck quacking");
    }
}
