package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.StopsDTO;
import dev.ginamirando.reachablebackend.models.Line;

import java.util.List;

public interface StopService {

    List<StopsDTO> getRoutes(Line line);
    List<StopsDTO> getAllStops();
    List<Arrival> getArrival(int parentId);
}

