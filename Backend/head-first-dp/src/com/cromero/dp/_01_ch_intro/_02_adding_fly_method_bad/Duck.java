package com.cromero.dp._01_ch_intro._02_adding_fly_method_bad;

public abstract class Duck {

    /**
     * At this moment, every duck quack the same way     *
     */
    public void quack() {
        System.out.println("I'm quacking!");
    }

    /**
     * At this moment, every duck swim the same way
     */
    public void swim() {
        System.out.println("I'm swimming");
    }

    /**
     * Adding fly method here is wrong! Because not all the ducks can fly
     */
    public void fly() {
        System.out.println("I'm flying");
    }

    /**
     * This method is abstract since all ducks have a different shape
     */
    public abstract void display();

}
