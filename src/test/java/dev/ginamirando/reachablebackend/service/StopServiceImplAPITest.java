package dev.ginamirando.reachablebackend.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StopServiceImplAPITest {

    final StopServiceUtil util = new StopServiceUtil(null);
    final StopServiceImplAPI underTest = new StopServiceImplAPI(null, util);

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
