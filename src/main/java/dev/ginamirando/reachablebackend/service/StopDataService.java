package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.StopsDTO;
import dev.ginamirando.reachablebackend.models.Line;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.*;

@Component
public class StopDataService {

    private final static List<StopsDTO> allStops;

    static {
        // TODO: Externalize these values
        final URI uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("data.cityofchicago.org")
                .path("/resource/8pix-ypme.json")
                .build()
                .toUri();
        // TODO: Remove this SOUT
        System.out.println(uri);
        WebClient client = WebClient.create();
        allStops = client.get()
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<StopsDTO>>() {})
                .block();
    }

    public static List<StopsDTO> getAllStops() {
        return new ArrayList<>(allStops);
    }
    
    public static List<StopsDTO> allRedStops() {
        final List<StopsDTO> reds = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getRedLine()) {
                reds.add(stop);
            }
        });

        return reds;
    }

    public static List<StopsDTO> allBlueStops() {
        final List<StopsDTO> blues = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getBlueLine()) {
                blues.add(stop);
            }
        });

        return blues;
    }

    public static List<StopsDTO> allGreenStops() {
        final List<StopsDTO> greens = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getGreenLine()) {
                greens.add(stop);
            }
        });

        return greens;
    }

    public static List<StopsDTO> allBrownStops() {
        final List<StopsDTO> browns = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getBrownLine()) {
                browns.add(stop);
            }
        });

        return browns;
    }

    public static List<StopsDTO> allPurpleStops() {
        final List<StopsDTO> purples = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getPurpleLine()) {
                purples.add(stop);
            }
        });

        return purples;
    }

    public static List<StopsDTO> allPurpleExpressStops() {
        final List<StopsDTO> purpleExpressStops = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getWhatTheFilthIsThisHaha()) {
                purpleExpressStops.add(stop);
            }
        });

        return purpleExpressStops;
    }

    public static List<StopsDTO> allYellowStops() {
        final List<StopsDTO> yellows = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getYellowLine()) {
                yellows.add(stop);
            }
        });

        return yellows;
    }

    public static List<StopsDTO> allPinkStops() {
        final List<StopsDTO> pinks = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getPinkLine()) {
                pinks.add(stop);
            }
        });

        return pinks;
    }

    public static List<StopsDTO> allOrangeStops() {
        final List<StopsDTO> oranges = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getOrangeLine()) {
                oranges.add(stop);
            }
        });

        return oranges;
    }

    public static Map<Line, List<StopsDTO>> lineToStops() {
        Map<Line, List<StopsDTO>> theStops = new EnumMap<>(Line.class);
        theStops.put(Line.RED, allRedStops());
        theStops.put(Line.BLUE, allBlueStops());
        theStops.put(Line.GREEN, allGreenStops());
        theStops.put(Line.BROWN, allBrownStops());
        theStops.put(Line.PURPLE, allPurpleStops());
        theStops.put(Line.PURPLEEXPRESS, allPurpleExpressStops());
        theStops.put(Line.YELLOW, allYellowStops());
        theStops.put(Line.PINK, allPinkStops());
        theStops.put(Line.ORANGE, allOrangeStops());

        return theStops;
    }

}

