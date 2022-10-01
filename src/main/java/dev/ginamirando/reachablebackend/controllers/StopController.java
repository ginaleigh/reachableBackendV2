package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.Route;
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

    private final List<Route> routes;


    public StopController() {

    }

    @GetMapping(value = "/stop")
    private final List<Route> getRoutes() {
      if (routes.isEmpty()) {
          routes.addAll(service.getRoutes());
      }

      return new ArrayList<>(routes);
    }


//    @GetMapping(value = "/stop/{parentId}")
//    private final Stop getParentId(@PathVariable Integer parentId) {
//        for (Stop s : routes) {
//            if (s.parentId() == (parentId)) {
//                return s;
//            }
//        }
//        return null;
//
//    }
    @GetMapping(value = "/arrivals/{parentId}")
    private final List<Arrival> getArrivals(@PathVariable Integer parentId) {
                if(parentId != null && parentId > 30_000)
                {
                    return service.getArrival(parentId);
                }
        return null;
    }

}

//ask ryan if we change about to 30_000-40_000
//0-29999 = Bus routes
//30000-39999 = Train routes
//40000-49999 = Train stations (parent routes) pg 24 in pdf -- need for if statement stop/parent & long term when I add bus times




