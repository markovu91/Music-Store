package com.ynn.muscirecords.services;

import java.util.List;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Track;
import com.ynn.muscirecords.model.DTO.TrackDTO;

public interface TrackService {
	
	List<Track> getAllTracksByAlbum(Album album);
	Track save(TrackDTO trackDTO);

	
}
