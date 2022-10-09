package dev.ginamirando.reachablebackend.service;

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

    private final StopServiceUtil util;

    public StopServiceImplAPI(final StopServiceUtil util) {
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
    public List<Arrival> getArrival(int parentId) {
        URI uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("lapi.transitchicago.com/api/1.0")
                .path("ttarrivals.aspx")
                .queryParam("key","9d5f0f7eb96941a99a4eeaed221e3f1e")
                .queryParam("mapid", parentId)
                .queryParam("outputType", "JSON")
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




