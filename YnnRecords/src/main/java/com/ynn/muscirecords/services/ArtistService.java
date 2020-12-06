package com.ynn.muscirecords.services;

import java.util.List;

import com.ynn.muscirecords.model.Artist;

public interface ArtistService {

	List<Artist> getAllArtists();
	Artist getArtistById(Integer id);
}
