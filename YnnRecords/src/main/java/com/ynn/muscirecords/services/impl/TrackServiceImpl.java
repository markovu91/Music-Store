package com.ynn.muscirecords.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Track;
import com.ynn.muscirecords.model.DTO.TrackDTO;
import com.ynn.muscirecords.repository.TrackRepository;
import com.ynn.muscirecords.services.AlbumService;
import com.ynn.muscirecords.services.TrackService;

@Service
public class TrackServiceImpl implements TrackService {
	
	@Autowired
	TrackRepository trackRepository;
	
	@Autowired
	AlbumService albumService;

	@Override
	public List<Track> getAllTracksByAlbum(Album album) {
		
		List<Track> tracksByAlbum = trackRepository.findByAlbum(album);
		
		return tracksByAlbum;
	}

	@Override
	public Track save(TrackDTO trackDTO) {
		Track newTrack = new Track();
	
		return null;
	}



}
