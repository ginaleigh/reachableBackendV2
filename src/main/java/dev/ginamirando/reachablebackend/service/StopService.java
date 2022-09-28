package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Stop;

import java.util.List;

public interface StopService {
    List<Stop> getStops();
    List<Arrival> getArrival();
}

