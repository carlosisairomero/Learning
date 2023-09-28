package org.cromero._03_streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.cromero._03_streams._Stream.Gender.FEMALE;
import static org.cromero._03_streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        System.out.println("-------------------------------------------");
        System.out.println("Printing unique genders");
        System.out.println("-------------------------------------------");

        people.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");
        System.out.println("Printing the length of every name");
        System.out.println("-------------------------------------------");

        people.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");
        System.out.println("Asking if all people are FEMALES");
        System.out.println("-------------------------------------------");

        boolean areAllFemales = people.stream()
                .allMatch(person -> person.getGender().equals(FEMALE));
        System.out.println("Are all females: " + areAllFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }
    }

    static enum Gender {
        MALE, FEMALE,
    }

}
