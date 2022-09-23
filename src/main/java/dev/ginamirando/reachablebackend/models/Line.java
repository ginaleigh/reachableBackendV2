package dev.ginamirando.reachablebackend.models;

import java.util.ArrayList;
import java.util.List;

public enum Line {
    BLUE("Blue"),
    BROWN("Brown"),
    RED("Red"),
    GREEN("Green"),
    ORANGE("Orange"),
    PURPLE("Purple"),
    PINK("Pink"),
    YELLOW("Yellow");

    private final String displayValue;

    Line(String displayValue) {
        this.displayValue = displayValue;
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

}

// Line color as enum