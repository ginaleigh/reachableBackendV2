package dev.ginamirando.reachablebackend.models;

public record Stop(String stopName, String direction, int stopId, int parentId, boolean adaFriendly, String address) {
}
