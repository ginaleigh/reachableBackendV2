package dev.ginamirando.reachablebackend.models;

public class Stop {
//do I make these final as suggested? will I need inheritance?
    private String stopName;
    private String direction;
    private int stopId;
    //private int parentId;

    public Stop(String stopName, String direction, int stopId, int parentId) {
        this.stopName = stopName;
        this.direction = direction;
        this.stopId = stopId;
//        this.parentId = parentId;
    }

    public String getStopName() {
        return stopName;
    }

    public String getDirection() {
        return direction;
    }

    public int getStopId() {
        return stopId;
    }

   // public int getParentId() {
        //return parentId;
    }


// Objects to include in stop class - Stop name, Stop ID, Direction? (might not be relevant), parent id (share with lines or have here also? - would make public not private then),