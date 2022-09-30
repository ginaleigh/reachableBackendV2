package dev.ginamirando.reachablebackend.models;

import java.util.ArrayList;
import java.util.List;

public enum Line {
    BLUE("Blue", "blue,"),
    BROWN("Brown", "brn,"),
    RED("Red", "red,"),
    GREEN("Green", "g,"),
    ORANGE("Orange", "org,"),
    PURPLE("Purple", "p,"),
    PINK("Pink", "pink,"),
    YELLOW("Yellow", "y");

    private final String displayValue;
    private final String ctaValue;

    Line(String displayValue, String ctaValue) {
        this.displayValue = displayValue;
        this.ctaValue = ctaValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public static List<String> displayableColors() {
        List<String> lines = new ArrayList<>();
        for (Line l : Line.values()) {
            lines.add(l.displayValue);
        }
        return lines;
    }

    public static List<String> uriValues() {
        List<String> lines2 = new ArrayList<>();
        for (Line l : Line.values()) {
            lines2.add(l.ctaValue);
        }
        return lines2;
    }



}

// @JsonValue to serialize enum via its name