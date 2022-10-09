package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Line;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class StopServiceImplAPITest {

    final StopServiceImplAPI underTest = new StopServiceImplAPI();

    @Test
    void getRoutes() {
//        try(MockedStatic<StopServiceUtil> mc = Mockito.mockStatic(StopServiceUtil.class)) {
//            List<LStops> theList = new ArrayList<>();
//            theList.add(new LStops(11111, "dddd", "eeee", "ssss", "dddd", 44444,
//                    true, true, true, true, true, true, true, true, true, true));
//
//            Map<Line, List<LStops>> theMap = new HashMap<>();
//            theMap.put(Line.BLUE, theList);
//
//            when(StopServiceUtil.lineToStops()).thenReturn(theMap);
//
//
//            List<LStops> whatIExpect = underTest.getRoutes(Line.BLUE);
//            assertEquals(1, whatIExpect.size(), "I expect these two have 1 value");
//        }
    }

    @Test
    void getAllStops() {
    }

    @Test
    void getArrival() {
    }

}