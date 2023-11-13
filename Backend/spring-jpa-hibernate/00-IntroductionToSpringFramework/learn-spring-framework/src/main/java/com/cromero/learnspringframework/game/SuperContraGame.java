package com.cromero.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements Game {

    public void up() {
        System.out.println("SuperContraGame UP");
    }

    public void down() {
        System.out.println("SuperContraGame DOWN");
    }

    public void left() {
        System.out.println("SuperContraGame LEFT");
    }

    public void right() {
        System.out.println("SuperContraGame RIGHT");
    }



}
