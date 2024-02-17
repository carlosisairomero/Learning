package com.cromero.dp._01_ch_intro._02_adding_fly_method_bad;

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
        // A Rubber Duck shouldn't quack! It should squeak!
        rubberDuck.quack();
        System.out.println("(A Rubber Duck shouldn't quack! It should squeak!)");
        // This is Wrong! A Rubber Duck can't fly!
        rubberDuck.fly();
        System.out.println("(WRONG! A Rubber duck can't fly!)");
    }

}
