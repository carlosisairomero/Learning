package com.cromero.rest.ws.restfulwebservices.security;

import static org.springframework.security.config.Customizer.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // All requests should be authenticated

        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );

        // If a request is not authenticated, a web page is shown

        http.httpBasic(withDefaults());

        // CSRF -> POST, PUT

        HttpSecurity disable = http.csrf().disable();

        return http.build();
    }

}
