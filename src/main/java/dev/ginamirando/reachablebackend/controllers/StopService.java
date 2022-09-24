package dev.ginamirando.reachablebackend.controllers;


import dev.ginamirando.reachablebackend.models.Stop;

import java.util.ArrayList;
import java.util.List;

public class StopService {

    private final List<Stop> stops = new ArrayList<>();

    public StopService() {
        Stop stop1 = new Stop("Testing1", "W", 1, 2, false, "overthere");
        Stop stop2 = new Stop("Testing2", "N", 2, 3, true, "somewhere");

        stops.add(stop1);
        stops.add(stop2);

    }

    public List<Stop>getStops() {
        return stops;
    }
}

