package com.cromero.dp._01_ch_intro._03_adding_interfaces_no_solution_yet;

    public class MallarDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("I'm a Mallar duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallar duck flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallar duck quacking");
    }
}
