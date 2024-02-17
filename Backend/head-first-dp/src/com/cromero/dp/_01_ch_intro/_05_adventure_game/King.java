package com.cromero.dp._01_ch_intro._05_adventure_game;

import com.cromero.dp._01_ch_intro._05_adventure_game.weapon_behaviors.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a King");
    }
}
