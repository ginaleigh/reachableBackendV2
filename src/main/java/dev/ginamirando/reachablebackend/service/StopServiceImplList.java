package dev.ginamirando.reachablebackend.service;


import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Stop;

import java.util.ArrayList;
import java.util.List;



public class StopServiceImplList implements StopService {

    private final List<Stop> stops = new ArrayList<>();

    public StopServiceImplList() {
        Stop stop1 = new Stop("Testing1", "W", 1, 2, false, "overthere");
        Stop stop2 = new Stop("Testing2", "N", 2, 3, true, "somewhere");

        stops.add(stop1);
        stops.add(stop2);

    }

    @Override
    public List<Stop> getStops() {
        return stops;
    }

    @Override
    public List<Arrival> getArrival() {
        return null;
    }

}

