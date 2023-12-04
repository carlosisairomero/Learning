package com.cromero.mockito.mockitodemo.business;

import com.cromero.mockito.mockitodemo.data.DataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void test_scneario1() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void test_scneario2() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void test_scneario3() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {-25, -15, -5});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(-5, result);
    }
}





