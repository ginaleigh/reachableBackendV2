package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Arrival {
    @JsonProperty("staNm")
    private String stationName;
    @JsonProperty("stpDe")
    private String destinationName;
    @JsonProperty("arrT")
    private String arrivalTime;


}
