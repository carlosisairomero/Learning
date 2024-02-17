package com.cromero.dp._01_ch_intro._01_initial_state;

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
     * This method is abstract since all ducks have a different shape
     */
    public abstract void display();

}
