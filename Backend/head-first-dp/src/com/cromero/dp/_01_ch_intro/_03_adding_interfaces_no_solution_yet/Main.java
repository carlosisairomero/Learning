package com.cromero.dp._01_ch_intro._03_adding_interfaces_no_solution_yet;

public class Main {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.quack();
        mallarDuck.fly();

        System.out.println("----------------------");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("----------------------");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        // Rubber duck is not supposed to call fly() anymore!
    }

}
