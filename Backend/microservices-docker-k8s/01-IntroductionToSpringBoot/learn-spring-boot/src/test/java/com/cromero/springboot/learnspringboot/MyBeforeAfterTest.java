package com.cromero.springboot.learnspringboot;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyBeforeAfterTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        System.out.println("--------------");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @Test
    void test3() {
        System.out.println("test3");
    }


    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("--------------");
        System.out.println("afterAll");
    }

}
