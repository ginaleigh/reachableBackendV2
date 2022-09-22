package dev.ginamirando.reachablebackend;

public class Line {
    enum lineColor {
        Blue,
        Brown,
        Red,
        Green,
        Orange,
        Purple,
        Pink,
        Yellow
    }

    public Line(String[] args) {
        lineColor var = lineColor.Blue;
        System.out.println(var);
    }
}

// Line color as enum , parent id here or stops? , parent id **geolocation of stop (././staId), parent station name (././staNm)
// { name: "Blue" },
//  { name: "Brown" },
//  { name: "Red" },
//  { name: "Green" },
//  { name: "Orange" },
//  { name: "Purple" },
//  { name: "Pink" },
//  { name: "Yellow" },