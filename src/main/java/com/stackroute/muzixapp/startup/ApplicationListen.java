package com.stackroute.muzixapp.startup;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.repository.TrackRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class ApplicationListen implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private TrackRepository trackRepository;

    @Autowired
    Environment environment;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("inside listener");
        trackRepository.save(new Track(Integer.parseInt(environment.getProperty("id2")), environment.getProperty("name2"), environment.getProperty("comment2")));
    }
}