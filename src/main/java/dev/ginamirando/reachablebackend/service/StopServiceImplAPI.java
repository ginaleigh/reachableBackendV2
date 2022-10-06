package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.configuration.StopConfiguration;
import dev.ginamirando.reachablebackend.models.Arrival;
import dev.ginamirando.reachablebackend.models.CtaResponse;
import dev.ginamirando.reachablebackend.models.Ctatt;
import dev.ginamirando.reachablebackend.models.LStops;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
@Primary
public class StopServiceImplAPI implements StopService {

    private final StopConfiguration config;

    private StopServiceImplAPI(final StopConfiguration config) {
        this.config = config;
    }

    @Override
    public List<LStops> getRoutes() {
        return StopDataService.allBlueStops();
    }
    @Override
    public List<StopsDTO> getAllStops() {
        return StopDataService.getAllStops();
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
        System.out.println(uri);
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


