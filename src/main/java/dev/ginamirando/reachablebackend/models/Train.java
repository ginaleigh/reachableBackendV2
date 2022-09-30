package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Train {
    @JsonProperty("rn")
    private String runNumber;

    @JsonProperty("destSt")
    private String destinationStation;

    @JsonProperty("destNm")
    private String destinationName;

    @JsonProperty("trDr")
    private String trainDirection;

    @JsonProperty("nextStaId")
    private String nextParentStationId;

    @JsonProperty("nextStpId")
    private String nextStopProperName;

    @JsonProperty("prdt")
    private String predictionTime;

    @JsonProperty("arrT")
    private String arrivalTime;

    @JsonProperty("isApp")
    private String approachingOrDue;

    @JsonProperty("isDly")
    private String isDelayed;

    @JsonProperty("lat")
    private String latitude;

    @JsonProperty("lon")
    private String longitude;

    @JsonProperty("heading")
    private String headingNSEW;

    public Train(String runNumber, String destinationStation, String destinationName, String trainDirection, String nextParentStationId, String nextStopProperName, String predictionTime, String arrivalTime, String approachingOrDue, String isDelayed, String latitude, String longitude, String headingNSEW) {
        this.runNumber = runNumber;
        this.destinationStation = destinationStation;
        this.destinationName = destinationName;
        this.trainDirection = trainDirection;
        this.nextParentStationId = nextParentStationId;
        this.nextStopProperName = nextStopProperName;
        this.predictionTime = predictionTime;
        this.arrivalTime = arrivalTime;
        this.approachingOrDue = approachingOrDue;
        this.isDelayed = isDelayed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.headingNSEW = headingNSEW;
    }

    public Train() {
    }

    //    @JsonProperty("train")
//    private List<Stops> getStops;
//
//    public List<Stop> stops() {
//        return getStops;
//}

    public String getRunNumber() {
        return runNumber;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getTrainDirection() {
        return trainDirection;
    }

    public String getNextParentStationId() {
        return nextParentStationId;
    }

    public String getNextStopProperName() {
        return nextStopProperName;
    }

    public String getPredictionTime() {
        return predictionTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getApproachingOrDue() {
        return approachingOrDue;
    }

    public String getIsDelayed() {
        return isDelayed;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getHeadingNSEW() {
        return headingNSEW;
    }

    public void setRunNumber(String runNumber) {
        this.runNumber = runNumber;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public void setTrainDirection(String trainDirection) {
        this.trainDirection = trainDirection;
    }

    public void setNextParentStationId(String nextParentStationId) {
        this.nextParentStationId = nextParentStationId;
    }

    public void setNextStopProperName(String nextStopProperName) {
        this.nextStopProperName = nextStopProperName;
    }

    public void setPredictionTime(String predictionTime) {
        this.predictionTime = predictionTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setApproachingOrDue(String approachingOrDue) {
        this.approachingOrDue = approachingOrDue;
    }

    public void setIsDelayed(String isDelayed) {
        this.isDelayed = isDelayed;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setHeadingNSEW(String headingNSEW) {
        this.headingNSEW = headingNSEW;
    }
}
