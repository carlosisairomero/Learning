package com.cromero.dp._01_ch_intro._03_adding_interfaces_no_solution_yet;

public abstract class Duck {

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

}
