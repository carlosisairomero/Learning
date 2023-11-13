package com.cromero.learnspringframework.game;


import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements Game {

    public void up() {
        System.out.println("PagmanGame UP");
    }

    public void down() {
        System.out.println("PagmanGame DOWN");
    }

    public void left() {
        System.out.println("PagmanGame LEFT");
    }

    public void right() {
        System.out.println("PagmanGame RIGHT");
    }



}
