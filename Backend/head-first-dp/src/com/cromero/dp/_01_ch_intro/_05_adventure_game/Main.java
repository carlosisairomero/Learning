package com.cromero.dp._01_ch_intro._05_adventure_game;

import com.cromero.dp._01_ch_intro._05_adventure_game.weapon_behaviors.AxeBehavior;
import com.cromero.dp._01_ch_intro._05_adventure_game.weapon_behaviors.BowAndArrowBehavior;

public class Main {
    public static void main(String[] args) {

        System.out.println("Working with Queen");
        Queen queen = new Queen();
        queen.display();
        queen.fight();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.fight();

        System.out.println("--------------------------");

        System.out.println("Working with King");
        King king = new King();
        king.display();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
