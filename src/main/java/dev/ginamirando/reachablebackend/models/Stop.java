package dev.ginamirando.reachablebackend.models;

public class Stop {
    private final String stopName;
    private final String direction;
    private final int stopId;
    private final int parentId;
    private final boolean adaFriendly;
    private final String address;

    public Stop(String stopName, String direction, int stopId, int parentId, boolean adaFriendly, String address) {
        this.stopName = stopName;
        this.direction = direction;
        this.stopId = stopId;
        this.parentId = parentId;
        this.adaFriendly = adaFriendly;
        this.address = address;
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

    public int getParentId() {
        return parentId;
    }

    public boolean isAdaFriendly() {
        return adaFriendly;
    }

    public String getAddress() {
        return address;
    }
}



// Objects to include in stop class - Stop name, Stop ID, Direction? (might not be relevant), parent id (share with lines or have here also? - would make public not private then),