package org.cromero._06_callbacks_and_lambdas;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {
        hello("Carlos",  null, value -> System.out.println("No Lastname provided for " + value));
        hello2("Carlos",  null, () -> System.out.println("No Lastname provided"));
    }

    // In javascript we have this concept: Callback

    /*
    function hello(firstName, lastName, callback) {
        console.log(firstName);
        if(lastName) {
            console.log(lastName);
        } else {
            callback();
        }
    }

    hello("Carlos", null, function() {console.log("No LastName provided")})
    */

    // We can also have the same concept in Java
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }

    }

}
