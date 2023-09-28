package org.cromero._02_functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Normal Function");
        System.out.println("-------------------------------------------");

        int incrementByOneNormalWay = incrementByOne(1);
        System.out.println(incrementByOneNormalWay);

        System.out.println("-------------------------------------------");
        System.out.println("Function Interface");
        System.out.println("-------------------------------------------");

        Integer incrementByOneFunction = _Function.incrementByOneFunction.apply(1);
        System.out.println(incrementByOneFunction);

        System.out.println("-------------------------------------------");
        System.out.println("Chained Function Interfaces");
        System.out.println("-------------------------------------------");

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = _Function.incrementByOneFunction.andThen(multipleBy10Function);
        int chainedFunctionsResult = addBy1AndThenMultiplyBy10.apply(1);
        System.out.println(chainedFunctionsResult);

        System.out.println("-------------------------------------------");
        System.out.println("Normal Function");
        System.out.println("-------------------------------------------");

        int incrementByOneAndMultiply = incrementByOneAndMultiply(2, 2);
        System.out.println(incrementByOneAndMultiply);

        System.out.println("-------------------------------------------");
        System.out.println("BiFunction Interface");
        System.out.println("-------------------------------------------");

        Integer incrementByOneAndMultiplyBiFunction = _Function.incrementByOneAndMultiplyBiFunction.apply(2, 2);
        System.out.println(incrementByOneAndMultiplyBiFunction);

    }

    static int incrementByOne(int number) {
        return number + 1;
    }
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
