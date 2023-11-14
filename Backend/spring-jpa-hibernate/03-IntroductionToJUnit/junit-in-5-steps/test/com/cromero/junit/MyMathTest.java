package com.cromero.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void testEmptyArrayReturnsZero() {
        assertEquals(0, math.sum(new int[] {}), "should be 0");
    }

    @Test
    void testFilledArrayReturnsASum() {
        assertEquals(6, math.sum(new int[] {1,2,3}), "should be 0");
    }

}