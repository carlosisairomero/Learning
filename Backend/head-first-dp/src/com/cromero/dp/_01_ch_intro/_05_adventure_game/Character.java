package com.cromero.dp._01_ch_intro._05_adventure_game;

import com.cromero.dp._01_ch_intro._05_adventure_game.weapon_behaviors.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public abstract void display();

    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
