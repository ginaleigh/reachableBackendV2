package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
    @JsonProperty("@name")
    private String name;

    @JsonProperty("train")
    List<Train> trains;

}
