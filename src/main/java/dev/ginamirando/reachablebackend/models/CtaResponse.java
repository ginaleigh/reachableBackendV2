package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CtaResponse(@JsonProperty("ctatt") Ctatt response) {
}
