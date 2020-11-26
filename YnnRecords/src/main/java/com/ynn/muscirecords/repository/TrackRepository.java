package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Track;

public interface TrackRepository extends JpaRepository<Integer, Track> {

}
