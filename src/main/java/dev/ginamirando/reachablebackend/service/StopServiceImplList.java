package dev.ginamirando.reachablebackend.service;


import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Stop;

import java.util.ArrayList;
import java.util.List;



public class StopServiceImplList implements StopService {

    public StopServiceImplList() {
        Stop stop1 = new Stop("Testing1", "W", 1, 2, false, "overthere");
        Stop stop2 = new Stop("Testing2", "N", 2, 3, true, "somewhere");

        List<Stop> stops = new ArrayList<>();
        stops.add(stop1);
        stops.add(stop2);

    }
    @Override
    public List<Route> getRoutes() {
        return null;
    }

    @Override
    public List<Arrival> getArrival(int parentId) {
        return null;
    }

}

