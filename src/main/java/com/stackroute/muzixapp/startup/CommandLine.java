package com.stackroute.muzixapp.startup;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.repository.TrackRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "track")


public class CommandLine implements CommandLineRunner {
    private TrackRepository trackRepository;

    private int id2;
    private String name2;
    private String comment2;

    public void setTrackRepository(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Track track= new Track();
        track.setId(id2);
        track.setComment(comment2);
        track.setName(name2);
        trackRepository.save(track);
    }


    public void setId2(int id2) {
        this.id2 = id2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }
}
