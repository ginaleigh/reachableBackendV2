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
public class StopServiceUtil {

    // Created to avoid instantiation
    private StopServiceUtil() {}

    private static final List<LStops> allStops;

    static {
        // TODO: Externalize these values
        final URI uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("data.cityofchicago.org")
                .path("/resource/8pix-ypme.json")
                .build()
                .toUri();
        // TODO: Remove this SOUT
        WebClient client = WebClient.create();
        allStops = client.get()
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<LStops>>() {})
                .block();
    }

    public static List<StopsDTO> getAllStops() {
        return new ArrayList<>(allStops);
    }

    public static List<StopsDTO> allRedStops() {
        final List<StopsDTO> reds = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.redLine()) {
                reds.add(stop);
            }
        });

        return reds;
    }

    public static List<LStops> allBlueStops() {
        final List<LStops> blues = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.blueLine()) {
                blues.add(stop);
            }
        });

        return blues;
    }

    public static List<LStops> allGreenStops() {
        final List<LStops> greens = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.greenLine()) {
                greens.add(stop);
            }
        });

        return greens;
    }

    public static List<LStops> allBrownStops() {
        final List<LStops> browns = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.brownLine()) {
                browns.add(stop);
            }
        });

        return browns;
    }

    public static List<LStops> allPurpleStops() {
        final List<LStops> purples = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.purpleLine()) {
                purples.add(stop);
            }
        });

        return purples;
    }

    public static List<LStops> allPurpleExpressStops() {
        final List<LStops> purpleExpressStops = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.whatTheFilthIsThisHaha()) {
                purpleExpressStops.add(stop);
            }
        });

        return purpleExpressStops;
    }

    public static List<LStops> allYellowStops() {
        final List<LStops> yellows = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.yellowLine()) {
                yellows.add(stop);
            }
        });

        return yellows;
    }

    public static List<LStops> allPinkStops() {
        final List<LStops> pinks = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.pinkLine()) {
                pinks.add(stop);
            }
        });

        return pinks;
    }

    public static List<LStops> allOrangeStops() {
        final List<LStops> oranges = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.orangeLine()) {
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

