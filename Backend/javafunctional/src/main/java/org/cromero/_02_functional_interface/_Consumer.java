package org.cromero._02_functional_interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer customer = new Customer("Maria", "123456789");

        System.out.println("-------------------------------------------");
        System.out.println("Normal Function");
        System.out.println("-------------------------------------------");

        greetCustomer(customer);

        System.out.println("-------------------------------------------");
        System.out.println("Consumer Interface");
        System.out.println("-------------------------------------------");

        greetCustomerConsumer.accept(customer);

        System.out.println("-------------------------------------------");
        System.out.println("BiConsumer Interface");
        System.out.println("-------------------------------------------");

        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello customer: " + customer.name + ", phone number: " + customer.phoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
            "Hello customer: " + customer.name + ", phone number: " + customer.phoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello customer: " + customer.name +
                    ", phone number: " + (showPhoneNumber ? customer.phoneNumber : "#########"));

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
