package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.configuration.ArrivalExtConfig;
import dev.ginamirando.reachablebackend.configuration.StopsExternalConfiguration;
import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Line;
import org.junit.jupiter.api.Test;
import org.springframework.boot.util.LambdaSafe;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StopServiceImplAPITest {

    private final StopsExternalConfiguration config = new StopsExternalConfiguration();
    private final ArrivalExtConfig arrivalExtConfig = new ArrivalExtConfig();
    final StopServiceUtil util = new StopServiceUtil(config);
    final StopServiceImplAPI underTest = new StopServiceImplAPI(arrivalExtConfig, util);

    @Test
    void getRoutes() {
    List<LStops> results = underTest.getRoutes(Line.RED);

    assertEquals(2, results.size());
    }

    @Test
    void getAllStops() {
    }

    @Test
    void getArrival() {
    }

}
