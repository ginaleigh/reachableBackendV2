package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Line;

import java.util.List;

public interface StopService {

    List<LStops> getRoutes(Line line);
    List<LStops> getAllStops();
    List<Arrival> getArrival(int parentId);
}

