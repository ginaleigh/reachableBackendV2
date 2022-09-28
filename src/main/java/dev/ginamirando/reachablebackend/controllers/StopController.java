package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Stop;
import dev.ginamirando.reachablebackend.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StopController {

    private final StopService service;

    private final List<Stop> stops;


    public StopController() {

    }

    @GetMapping(value = "/stop")
    private final List<Stop> getStops() {
      if (stops.isEmpty()) {
          stops.addAll(service.getStops());
      }

      return new ArrayList<>(stops);
    }


    @GetMapping(value = "/stop/{stopId}")
    private final Stop getStops(@PathVariable Integer stopId) {
        // What if the Integer is not an Integer
        for (Stop s : stops) {
            if (s.stopId() == (stopId)) {
                return s;
            }
        }
        return null;

    }
    @GetMapping(value = "/stop/{parentId}")
    private final Stop getParentId(@PathVariable Integer parentId) {
        for (Stop s : stops) {
            if (s.parentId() == (parentId)) {
                return s;
            }
        }
        return null;

    }
    @GetMapping(value = "/arrivals")
    private final List<Arrival> getArrivals() {
        return service.getArrival();

    }

}



