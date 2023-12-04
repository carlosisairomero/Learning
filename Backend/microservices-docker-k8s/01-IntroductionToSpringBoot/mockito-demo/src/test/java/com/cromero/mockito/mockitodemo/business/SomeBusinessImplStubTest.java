package com.cromero.mockito.mockitodemo.business;

import com.cromero.mockito.mockitodemo.data.DataService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {
    @Test
    void test() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 15, 5};
    }
}





