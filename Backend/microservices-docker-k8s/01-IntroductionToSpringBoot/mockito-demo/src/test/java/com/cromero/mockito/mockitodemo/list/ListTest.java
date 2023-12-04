package com.cromero.mockito.mockitodemo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    void simpleTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturns() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        // the last value will be the default value
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    void specificParameters() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("ValueOfPos0");
        assertEquals("ValueOfPos0", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void genericParameters() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("ValueOfAnyPos");
        assertEquals("ValueOfAnyPos", listMock.get(0));
        assertEquals("ValueOfAnyPos", listMock.get(1));
    }

}

