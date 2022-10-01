package dev.ginamirando.reachablebackend.service;

import dev.ginamirando.reachablebackend.configuration.StopConfiguration;
import dev.ginamirando.reachablebackend.models.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Locale;

@Service
@Primary
public class StopServiceImplAPI implements StopService {

    private final StopConfiguration config;

    private StopServiceImplAPI(final StopConfiguration config) {
        this.config = config;
    }

    @Override
    public List<Route> getRoutes() {
        StringBuilder allRoutes = new StringBuilder();
            for (String l : Line.uriValues()) {
                allRoutes.append(l.toLowerCase(Locale.ROOT));
            }

        URI uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("lapi.transitchicago.com/api/1.0")
                .path("ttpositions.aspx")
                .queryParam("key","")
                .queryParam("rt", allRoutes.toString())
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
                .map(Ctatt::routes)
                .block();

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
//ctatt stops
//pull api from YML
//externalize values
//TODO:


//call to CTA to get back all stops



//feed parameter of parentId to get specific stop information getArrival webclient request
    //will shorten uri to base call
    //add queryParam parentId
    //parentId will be provided to getArrival queryParam from List<RetrievingParameters> (this is where they will get pulled and stored)
//while app is starting it will need to first call for "RetrievingParams" to return and store all stop names, parent id and station name daily
//then it will call getArrival with unique "parentId"
// that will provide the info necessary to communicate requirements for front end



