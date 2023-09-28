package org.cromero._04_optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Working with nullables");
        System.out.println("-------------------------------------------");

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Object value2 = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
        System.out.println(value2);

        Optional.ofNullable("Yeah! It's present")
                .ifPresent(System.out::println);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No Present"));

        Object value3 = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("My Exception"));
        System.out.println(value3);

    }

}
