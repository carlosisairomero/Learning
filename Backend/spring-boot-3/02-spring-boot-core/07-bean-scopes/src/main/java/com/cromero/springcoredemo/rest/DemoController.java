package com.cromero.springcoredemo.rest;

import com.cromero.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach coach2;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach coach,
            @Qualifier("cricketCoach") Coach coach2) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.coach2 = coach2;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coach == coach2, " + (coach == coach2);
    }
}
