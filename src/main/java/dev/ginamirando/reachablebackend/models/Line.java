package dev.ginamirando.reachablebackend.models;

import java.util.Arrays;
import java.util.List;

public enum Line {
    BLUE("Blue", "blue,"),
    BROWN("Brown", "brn,"),
    RED("Red", "red,"),
    GREEN("Green", "g,"),
    ORANGE("Orange", "org,"),
    PURPLE("Purple", "p,"),
    PURPLEEXPRESS ("Purple Express" , "pexp"),
    PINK("Pink", "pink,"),
    YELLOW("Yellow", "y");

    private final String displayValue;
    private final String ctaValue;

    Line(String displayValue, String ctaValue) {
        this.displayValue = displayValue;
        this.ctaValue = ctaValue;
    }

    private String getDisplayValue() {
        return displayValue;
    }
    private String getCtaValue() { return ctaValue; }

    public static List<String> displayableColors() {
        return Arrays.stream(Line.values())
                .map(Line::getDisplayValue)
                .toList();
    }

    public static List<String> uriValues() {
        return Arrays.stream(Line.values())
                .map(Line::getCtaValue)
                .toList();

    }
}
