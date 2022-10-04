package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StopData {

    @JsonProperty("stopId")
    private String stops;

    @JsonProperty("stopCode")
    private String stopCode;

    @JsonProperty("stopName")
    private String stopName;

    @JsonProperty("stopDescription")
    private String stopDescription;

    @JsonProperty("stopLatitude")
    private String stopLatitude;

    @JsonProperty("stopLongitude")
    private String stopLongitude;

    @JsonProperty("locationType")
    private String heckIsLocationType;

    @JsonProperty("parentStation")
    private String parentStation;

    @JsonProperty("wheelchairBoarding")
    private String wheelchairBoarding;

}