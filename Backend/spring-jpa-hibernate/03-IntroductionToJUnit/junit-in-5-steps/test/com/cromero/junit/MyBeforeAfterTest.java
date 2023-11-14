package com.cromero.junit;

import org.junit.jupiter.api.*;

class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
        System.out.println("------------");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("------------");
        System.out.println("after all");
    }


    @Test
    void test1() {
        System.out.println("Test1");
    }

    @Test
    void test2() {
        System.out.println("Test2");
    }

    @Test
    void test3() {
        System.out.println("Test3");
    }

}