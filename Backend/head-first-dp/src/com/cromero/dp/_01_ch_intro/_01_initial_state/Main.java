package com.cromero.dp._01_ch_intro._01_initial_state;

public class Main {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.quack();
        mallarDuck.swim();

        System.out.println("----------------------");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
    }

}
