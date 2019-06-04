package com.stackroute.musixservice.repository;
import com.stackroute.musixservice.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TrackRepository extends MongoRepository<Track, Integer> {


    }

