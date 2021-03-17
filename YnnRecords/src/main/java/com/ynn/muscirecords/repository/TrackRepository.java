package com.ynn.muscirecords.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Track;

public interface TrackRepository extends JpaRepository<Track, Integer> {
	
	List<Track> findByAlbum(Album album);	
	


	
}
