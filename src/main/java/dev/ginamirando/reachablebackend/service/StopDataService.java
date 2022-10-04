package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.models.LStops;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class StopDataService {

    private final static List<LStops> allStops;

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
                .bodyToMono(new ParameterizedTypeReference<List<LStops>>() {})
                .block();
    }


    public static List<LStops> allRedStops() {
        final List<LStops> reds = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getRedLine()) {
                reds.add(stop);
            }
        });

        return reds;
    }

    public static List<LStops> allBlueStops() {
        final List<LStops> blues = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getBlueLine()) {
                blues.add(stop);
            }
        });

        return blues;
    }

    public static List<LStops> allGreenStops() {
        final List<LStops> greens = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getGreenLine()) {
                greens.add(stop);
            }
        });

        return greens;
    }

    public static List<LStops> allBrownStops() {
        final List<LStops> browns = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getBrownLine()) {
                browns.add(stop);
            }
        });

        return browns;
    }

    public static List<LStops> allPurpleStops() {
        final List<LStops> purples = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getPurpleLine()) {
                purples.add(stop);
            }
        });

        return purples;
    }

    public static List<LStops> allPurpleExpressStops() {
        final List<LStops> purpleExpressStops = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getWhatTheFilthIsThisHaha()) {
                purpleExpressStops.add(stop);
            }
        });

        return purpleExpressStops;
    }

    public static List<LStops> allYellowStops() {
        final List<LStops> yellows = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getYellowLine()) {
                yellows.add(stop);
            }
        });

        return yellows;
    }

    public static List<LStops> allPinkStops() {
        final List<LStops> pinks = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getPinkLine()) {
                pinks.add(stop);
            }
        });

        return pinks;
    }

    public static List<LStops> allOrangeStops() {
        final List<LStops> oranges = new ArrayList<>();
        allStops.forEach(stop -> {
            if (stop.getOrangeLine()) {
                oranges.add(stop);
            }
        });

        return oranges;
    }

}



