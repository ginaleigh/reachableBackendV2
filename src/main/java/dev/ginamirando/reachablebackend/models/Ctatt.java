package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ctatt {
    @JsonProperty("tmst")
    private String timeStamp;
    @JsonProperty("errCd")
    private String errorCode;
    @JsonProperty("errNm")
    private String errorName;
    @JsonProperty("eta")
    private List<Arrival> arrivals;


    public List<Arrival> arrivals() {
        return arrivals;
    }

    @JsonProperty("tmst")
    private String timeStamp() {
        return timeStamp;
    }

    @JsonProperty("errCd")
    private String errorCode() {
        return errorCode;
    }

    @JsonProperty("errNm")
    private String errorName() {
        return errorName;
    }

    private void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    private void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    private void setArrivals(List<Arrival> arrivals) {
        this.arrivals = arrivals;
    }
}






