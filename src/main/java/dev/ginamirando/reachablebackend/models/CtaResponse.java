package dev.ginamirando.reachablebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CtaResponse {
    @JsonProperty("ctatt")
    private Ctatt response;

    @JsonProperty("ctatt")
    public Ctatt response() {
        return response;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CtaResponse) obj;
        return Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        return "CtaResponse[" +
                "response=" + response + ']';
    }

    public void setResponse(Ctatt response) {
        this.response = response;
    }
}
