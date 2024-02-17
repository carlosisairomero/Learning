package com.cromero.dp._01_ch_intro._05_adventure_game;

import com.cromero.dp._01_ch_intro._05_adventure_game.weapon_behaviors.AxeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a Queen");
    }
}
