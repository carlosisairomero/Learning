package com.cromero.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {

    public void up() {
        System.out.println("MarioGame UP");
    }

    public void down() {
        System.out.println("MarioGame DOWN");
    }

    public void left() {
        System.out.println("MarioGame LEFT");
    }

    public void right() {
        System.out.println("MarioGame RIGHT");
    }



}
