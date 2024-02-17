package com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary;

import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.fly_behaviors.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {

        // Working with MallarDuck

        System.out.println("Working with MallarDuck");
        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        // Working with ModelDuck (which will change its behavior on runtime)

        System.out.println("------------------------------");
        System.out.println("Working with ModelDuck");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        System.out.println("Changing Fly Behavior on runtime...");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
