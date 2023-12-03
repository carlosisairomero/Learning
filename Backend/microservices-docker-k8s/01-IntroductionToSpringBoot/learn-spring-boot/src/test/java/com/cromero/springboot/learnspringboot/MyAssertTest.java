package com.cromero.springboot.learnspringboot;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test() {
        assertEquals(true, todos.contains("AWS"));
        assertEquals(3, todos.size(), "Size should be 3");
        assertTrue(todos.contains("AWS"), "It should be true");
        assertFalse(todos.contains("AAA"), "Shouldn't contain AAA");
        assertArrayEquals(new int[] {1,2}, new int[] {1,2}, "Both arrays should be equals");
    }

}
