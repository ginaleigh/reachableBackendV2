package dev.ginamirando.reachablebackend;

public class Train {

    private String approaching;
    private String heading;
    private boolean delayed;

    public Train(String approaching, String heading, boolean delayed) {
        this.approaching = approaching;
        this.heading = heading;
        this.delayed = delayed;
    }

    public String getApproaching() {
        return approaching;
    }

    public String getHeading() {
        return heading;
    }

    public boolean isDelayed() {
        return delayed;
    }
}

// Objects to include in Train class - approaching (././isApp), heading (././heading), delayed boolean (././isDly)