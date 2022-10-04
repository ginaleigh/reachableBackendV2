package dev.ginamirando.reachablebackend.controllers;

import dev.ginamirando.reachablebackend.models.Line;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LineController {

    @GetMapping(value = "lines")
    public final List<String> getLines() {
        System.out.println(Line.displayableColors() + "line controller");
        return Line.displayableColors();
        }

    @GetMapping(value = "routes")
    public final List<String> getRoutes() { return Line.uriValues();}


}
