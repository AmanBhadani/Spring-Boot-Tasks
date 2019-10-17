package com.stackroute.muzixapp.service;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.exceptions.TrackAlreadyExistsException;
import com.stackroute.muzixapp.exceptions.TrackNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("sample")
@Service("dummy")
public class TrackDummyServiceImpl implements TrackService {
    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        return null;
    }

    @Override
    public Track getTrackById(int id) throws TrackNotFoundException {
        return null;
    }

    @Override
    public void deleteTrack(int id) throws TrackNotFoundException {

    }

    @Override
    public List<Track> getAllTracks() {
        return null;
    }

    @Override
    public Track updateTrack(int id, String comment) throws TrackNotFoundException {
        return null;
    }

    @Override
    public void deleteall() {

    }

    @Override
    public List<Track> getTrackByName(String name) throws TrackNotFoundException {
        return null;
    }
}
