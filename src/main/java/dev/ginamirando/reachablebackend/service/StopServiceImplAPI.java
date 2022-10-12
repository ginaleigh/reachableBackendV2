package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.configuration.ArrivalExtConfig;
import dev.ginamirando.reachablebackend.models.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
@Primary
public class StopServiceImplAPI implements StopService {

    private final ArrivalExtConfig config;
    private final StopServiceUtil util;

    public StopServiceImplAPI(final ArrivalExtConfig config, final StopServiceUtil util) {
        this.config = config;
        this.util = util;
    }

    @Override
    public final List<LStops> getRoutes(Line line) {
        return util.lineToStops().get(line);
    }

    @Override
    public List<LStops> getAllStops() {
        return util.getAllStops();
    }

    @Override
    public List<Arrival> getArrival(int passedId) {
        final String idParameter = (passedId > 40_000) ? "mapid" : "stpid";

        URI uri = UriComponentsBuilder.newInstance()
                .scheme(config.getScheme())
                .host(config.getHost())
                .path(config.getPath())
                .queryParam("key", config.getKey())
                .queryParam("mapid", idParameter)
                .queryParam("outputType", config.getOutputType())
                .build()
                .toUri();
        WebClient client = WebClient.create();
        return client.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(CtaResponse.class)
                .map(CtaResponse::response)
                .map(Ctatt::arrivals)
                .block();

    }
}




