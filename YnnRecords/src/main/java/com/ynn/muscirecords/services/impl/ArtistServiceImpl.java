package com.ynn.muscirecords.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.repository.ArtistRepository;
import com.ynn.muscirecords.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	ArtistRepository artistRepository;
	

	@Override
	public List<Artist> getAllArtists() {
		List<Artist>artists=artistRepository.findAll();
		return artists;
	}


	@Override
	public Artist getArtistById(Integer id) {
		Optional<Artist> optional = artistRepository.findById(id);
		Artist artist = null;
		if (optional.isPresent()) {
			artist = optional.get();
		} else {throw new RuntimeException("Artist not found for id :: "+id);}
		return artist;
	}

}
