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
    public String timeStamp() {
        return timeStamp;
    }

    @JsonProperty("errCd")
    public String errorCode() {
        return errorCode;
    }

    @JsonProperty("errNm")
    public String errorName() {
        return errorName;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public void setArrivals(List<Arrival> arrivals) {
        this.arrivals = arrivals;
    }
}






