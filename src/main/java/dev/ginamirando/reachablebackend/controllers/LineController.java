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
    private final List<String> getLines() { return Line.displayableColors();}


}
