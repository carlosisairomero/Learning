package com.cromero.dp._01_ch_intro._04_extracting_parts_that_vary.quack_behaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
