package com.cromero.springcoredemo.config;

import com.cromero.springcoredemo.common.Coach;
import com.cromero.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
