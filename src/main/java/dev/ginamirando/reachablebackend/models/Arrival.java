package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Arrival(@JsonProperty("staNm") String stationName, @JsonProperty("stpDe") String destinationName,
                      @JsonProperty("arrT") String arrivalTime) {
}
