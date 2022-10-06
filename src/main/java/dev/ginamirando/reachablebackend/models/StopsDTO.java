package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LStops(@JsonProperty("stop_id") Integer stopId, @JsonProperty("direction_id") String directionId,
                     @JsonProperty("stop_name") String stopName, @JsonProperty("station_name") String stationName,
                     @JsonProperty("station_descriptive_name") String stationDescriptiveName,
                     @JsonProperty("map_id") Integer parentId, @JsonProperty("ada") Boolean adaFriendly,
                     @JsonProperty("red") Boolean redLine, @JsonProperty("blue") Boolean blueLine,
                     @JsonProperty("g") Boolean greenLine, @JsonProperty("brn") Boolean brownLine,
                     @JsonProperty("p") Boolean purpleLine, @JsonProperty("pexp") Boolean whatTheFilthIsThisHaha,
                     @JsonProperty("y") Boolean yellowLine, @JsonProperty("pnk") Boolean pinkLine,
                     @JsonProperty("o") Boolean orangeLine) {
}
