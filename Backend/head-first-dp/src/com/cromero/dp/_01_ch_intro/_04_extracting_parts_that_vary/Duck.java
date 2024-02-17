package com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary;

import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.fly_behaviors.FlyBehavior;
import com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.quack_behaviors.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * At this moment, every duck swim the same way
     */
    public void swim() {
        System.out.println("Duck swimming");
    }

    /**
     * This method is abstract since all ducks have a different shape
     */
    public abstract void display();

    /**
     * Program to an interface instead of an implementation
     * */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * Program to an interface instead of an implementation
     * */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
