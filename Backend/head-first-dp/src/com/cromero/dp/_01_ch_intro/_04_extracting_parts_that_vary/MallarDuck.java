package com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary;

import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.fly_behaviors.FlyWithWings;
import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.quack_behaviors.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallar duck");
    }
}
