package dev.ginamirando.reachablebackend.configuration;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Component
@ConfigurationProperties("cta-api")
public class StopConfiguration {

    private String key;

//    public StopConfiguration(String key) {
//        this.key = key;
//    } need this to make above final but didnt work is this to do with spring annotation?
}
