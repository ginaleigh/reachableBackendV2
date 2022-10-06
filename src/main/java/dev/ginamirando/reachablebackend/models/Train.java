package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Train(@JsonProperty("rn") String runNumber, @JsonProperty("destSt") String destinationStation,
                    @JsonProperty("destNm") String destinationName, @JsonProperty("trDr") String trainDirection,
                    @JsonProperty("nextStaId") String nextParentStationId,
                    @JsonProperty("nextStpId") String nextStopProperName, @JsonProperty("prdt") String predictionTime,
                    @JsonProperty("arrT") String arrivalTime, @JsonProperty("isApp") String approachingOrDue,
                    @JsonProperty("isDly") String isDelayed, @JsonProperty("lat") String latitude,
                    @JsonProperty("lon") String longitude, @JsonProperty("heading") String headingNSEW) { }
