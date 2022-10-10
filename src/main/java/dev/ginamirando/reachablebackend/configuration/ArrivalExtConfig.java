package dev.ginamirando.reachablebackend.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "external-api.arrival")
public class ArrivalExtConfig {
    private String scheme;
    private String host;
    private String path;
    private String key;
    private String outputType;
}
