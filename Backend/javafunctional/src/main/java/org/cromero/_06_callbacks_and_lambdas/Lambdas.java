package org.cromero._06_callbacks_and_lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = String::toUpperCase;
        System.out.println(upperCaseName.apply("carlos"));

        Function<String, String> upperCaseName2 = name -> {
            if(name.isEmpty()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };
        System.out.println(upperCaseName2.apply("carlos"));

        BiFunction<String, Integer, String> upperCaseName3 = (name, age) -> {
            if(name.isEmpty()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName3.apply("carlos", 20));

    }
}
