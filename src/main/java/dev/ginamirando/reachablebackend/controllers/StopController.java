package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Stop;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StopController {

    private final List<Stop> stops = new ArrayList<>();

    public StopController() {
        Stop stop1 = new Stop("BobsYourUncle", "W", 1, 2, false, "overthere");
        Stop stop2 = new Stop("GinaMirando", "N", 2,3,true,"somewhere");

        stops.add(stop1);
        stops.add(stop2);

    }

    @GetMapping(value = "/stop")
    public List<Stop> getStops() { return stops; }

    @GetMapping(value = "/stop/{stopId}")
    public Stop getStops(@PathVariable Integer stopId) {
        // What if the Integer is not an Integer
        for (Stop s : stops) {
            if (s.getStopId() == (stopId)) {
                return s;
            }
        }
        return null;

    }
    @GetMapping(value = "/stop/{parentId}")
    public Stop getParentId(@PathVariable Integer parentId) {
        for (Stop s : stops) {
            if (s.getParentId() == (parentId)) {
                return s;
            }
        }
        return null;

    }







}



