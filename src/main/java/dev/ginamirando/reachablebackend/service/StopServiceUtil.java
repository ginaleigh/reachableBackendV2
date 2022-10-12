package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.configuration.StopsExternalConfiguration;
import dev.ginamirando.reachablebackend.models.LStops;
import dev.ginamirando.reachablebackend.models.Line;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class StopServiceUtil {

    private final List<LStops> allStops;
    private final StopsExternalConfiguration config;
    public StopServiceUtil(final StopsExternalConfiguration config) {
        this.config = config;
        this.allStops = new ArrayList<>();
    }

    private void retrieveStops() {
        if (this.allStops.isEmpty()) {
            final URI uri = UriComponentsBuilder.newInstance()
                    .scheme(config.getScheme())
                    .host(config.getHost())
                    .path(config.getPath())
                    .build()
                    .toUri();
            final WebClient client = WebClient.create();
            final List<LStops> theStops = (client.get()
                    .uri(uri)
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<LStops>>() {})
                    .block());

            if (theStops != null) {
                this.allStops.addAll(theStops);
            }
        }
    }

    public List<LStops> getAllStops() {
        this.retrieveStops();
        return new ArrayList<>(allStops);
    }


    public List<LStops> allRedStops() {
        this.retrieveStops();
        final List<LStops> reds = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.redLine())) {
                reds.add(stop);
            }
        });

        return reds;
    }

    public List<LStops> allBlueStops() {
        this.retrieveStops();
        final List<LStops> blues = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.blueLine())) {
                blues.add(stop);
            }
        });

        return blues;
    }

    public List<LStops> allGreenStops() {
        this.retrieveStops();
        return allStops.stream()
                .filter(LStops::greenLine)
                .toList();
    }

    public List<LStops> allBrownStops() {
        this.retrieveStops();
        final List<LStops> browns = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.brownLine())) {
                browns.add(stop);
            }
        });

        return browns;
    }

    public List<LStops> allPurpleStops() {
        this.retrieveStops();
        final List<LStops> purples = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.purpleLine())) {
                purples.add(stop);
            }
        });

        return purples;
    }

    public List<LStops> allPurpleExpressStops() {
        this.retrieveStops();
        final List<LStops> purpleExpressStops = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.whatTheFilthIsThisHaha())) {
                purpleExpressStops.add(stop);
            }
        });

        return purpleExpressStops;
    }

    public List<LStops> allYellowStops() {
        this.retrieveStops();
        final List<LStops> yellows = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.yellowLine())) {
                yellows.add(stop);
            }
        });

        return yellows;
    }

    public List<LStops> allPinkStops() {
        this.retrieveStops();
        final List<LStops> pinks = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.pinkLine())) {
                pinks.add(stop);
            }
        });

        return pinks;
    }

    public List<LStops> allOrangeStops() {
        this.retrieveStops();
        final List<LStops> oranges = new ArrayList<>();
        allStops.forEach(stop -> {
            if (Boolean.TRUE.equals(stop.orangeLine())) {
                oranges.add(stop);
            }
        });

        return oranges;
    }

    public Map<Line, List<LStops>> lineToStops() {
        final Map<Line, List<LStops>> theStops = new EnumMap<>(Line.class);
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

