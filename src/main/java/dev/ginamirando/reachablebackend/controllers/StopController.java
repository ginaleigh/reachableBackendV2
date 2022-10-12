package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Line;
import dev.ginamirando.reachablebackend.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StopController {


    private final StopService service;

    public StopController(@Autowired StopService service) {
        this.service = service;
    }

    @GetMapping(value = "/stops/{line}")
    public List<LStops> getRoutes(@PathVariable final Line line) {
        return service.getRoutes(line);
    }
    @GetMapping(value = "/stops")
    public List<LStops> getAllRoutes() {
        return service.getAllStops();
    }

    // This will be called by the FE once you get back a list of stops, and BOTH dropdowns are selected (PINK - STOP NAME), we will get the parentId here.
    @GetMapping(value = "/arrivals/{parentId}")
    public List<Arrival> getArrivals(@PathVariable Integer parentId) {
        if (parentId != null && parentId > 30_000) {
            return service.getArrival(parentId);
        }
        return Collections.emptyList();
    }

}




