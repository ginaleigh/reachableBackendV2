package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.LStops;

import java.util.List;

public interface StopService {

    List<LStops> getRoutes();
    List<Arrival> getArrival(int parentId);
}

