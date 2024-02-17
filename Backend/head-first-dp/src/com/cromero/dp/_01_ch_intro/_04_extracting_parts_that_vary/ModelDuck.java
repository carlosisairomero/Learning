package com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary;

import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.fly_behaviors.FlyNoWay;
import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.quack_behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
