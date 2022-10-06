package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Ctatt(@JsonProperty("tmst") String timeStamp, @JsonProperty("errCd") String errorCode,
                    @JsonProperty("errNm") String errorName, @JsonProperty("eta") List<Arrival> arrivals,
                    @JsonProperty("route") List<Route> routes) {
}






