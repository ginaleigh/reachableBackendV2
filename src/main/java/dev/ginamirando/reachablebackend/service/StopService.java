package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Route;
import dev.ginamirando.reachablebackend.models.Stop;

import java.util.List;

public interface StopService {

    Object getRoutes();
    List<Arrival> getArrival(int parentId);
}

