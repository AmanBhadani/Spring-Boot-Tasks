package com.stackroute.muzixapp.startup;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;


@PropertySource("classpath:application.properties")
public class ApplicationListen implements ApplicationListener<ContextRefreshedEvent> {
    private TrackRepository trackRepository;

    @Value("$(track.id1)")
    private int id;

    @Autowired
    private Environment environment;

    @Autowired
    public void SetTrackRepository(TrackRepository trackRepository){
        this.trackRepository=trackRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Track track= new Track();
        track.setId(id);
        track.setComment(environment.getProperty("track.comment1"));
        track.setName(environment.getProperty("track.name1"));
        trackRepository.save(track);

    }
}
