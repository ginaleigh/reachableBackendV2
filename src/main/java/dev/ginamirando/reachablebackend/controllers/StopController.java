package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Route;
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

    private final List<Route> routes;

    private StopController(@Autowired StopService service) {
        this.service = service;
        routes = new ArrayList<>();
    }


    @GetMapping(value = "/stops")
    public Object getRoutes() {
        return service.getRoutes();
    }

    @GetMapping(value = "/arrivals/{parentId}")
    public List<Arrival> getArrivals(@PathVariable Integer parentId) {
                if(parentId != null && parentId > 30_000)
                {
                    return service.getArrival(parentId);
                }
        return null;
    }

}




