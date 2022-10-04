package dev.ginamirando.reachablebackend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.ginamirando.reachablebackend.models.StopData;
import lombok.SneakyThrows;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class StopDataService {
    @SneakyThrows
    public static void initialize() {

        ObjectMapper objectMapper = new ObjectMapper();
        var data = objectMapper.readValue(new File("src/main/resources/mapStationToStops.json"), new TypeReference<TreeMap<String, List<StopData>>>() {
        });

        System.out.println(getThisParent(data, 30001));

    }

    public static String getThisParent(Map<String, List<StopData>> theMap, int passedInInteger) {
        for (String key: theMap.keySet()) {
            for (StopData stopData : theMap.get(key)) {
                if (Integer.parseInt(stopData.getStops()) == passedInInteger) {
                    return stopData.getParentStation();
                }
            }
        }
        return "00000";
    }
}



