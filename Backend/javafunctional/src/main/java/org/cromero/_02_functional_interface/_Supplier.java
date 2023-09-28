package org.cromero._02_functional_interface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Normal Function");
        System.out.println("-------------------------------------------");

        System.out.println(getDBConnectionUrl());

        System.out.println("-------------------------------------------");
        System.out.println("Supplier Function");
        System.out.println("-------------------------------------------");

        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:3306/mysql";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:3306/mysql";

}
