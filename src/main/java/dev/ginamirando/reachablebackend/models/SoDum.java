package dev.ginamirando.reachablebackend.models;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SoDum {
    Map<String, List<StopData>> stationToStop;
}
