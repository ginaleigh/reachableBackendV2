package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LStops {
    @JsonProperty("stop_id")
    private Integer stopId;

    @JsonProperty("direction_id")
    private String directionId;

    @JsonProperty("stop_name")
    private String stopName;

    @JsonProperty("station_name")
    private String stationName;

    @JsonProperty("station_descriptive_name")
    private String stationDescriptiveName;

    @JsonProperty("map_id")
    private Integer parentId;

    @JsonProperty("ada")
    private Boolean adaFriendly;

    @JsonProperty("red")
    private Boolean redLine;

    @JsonProperty("blue")
    private Boolean blueLine;

    @JsonProperty("g")
    private Boolean greenLine;

    @JsonProperty("brn")
    private Boolean brownLine;

    @JsonProperty("p")
    private Boolean purpleLine;

    @JsonProperty("pexp")
    private Boolean whatTheFilthIsThisHaha;

    @JsonProperty("y")
    private Boolean yellowLine;

    @JsonProperty("pnk")
    private Boolean pinkLine;

    @JsonProperty("o")
    private Boolean orangeLine;

}
