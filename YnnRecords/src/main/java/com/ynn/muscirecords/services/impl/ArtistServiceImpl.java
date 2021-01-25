package com.ynn.muscirecords.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.model.Genre;
import com.ynn.muscirecords.model.DTO.ArtistDTO;
import com.ynn.muscirecords.repository.ArtistRepository;
import com.ynn.muscirecords.repository.GenreRepository;
import com.ynn.muscirecords.repository.UserRepository;
import com.ynn.muscirecords.services.ArtistService;
import com.ynn.muscirecords.services.GenreService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	ArtistRepository artistRepository;
	
	@Autowired
	GenreService genreService;
	

	@Override
	public List<Artist> findAll() {
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


	@Override
	public Page<Artist> findPageableArtists(Pageable pageable) {
		return artistRepository.findAll(pageable);
	}


	@Override
	public Artist save(ArtistDTO artistDTO) {
		
		Artist newArtist = new Artist();
		Genre genre = genreService.findByGenreName();
		
		newArtist.setArtistName(artistDTO.getArtistName());
		newArtist.setArtistDescription(artistDTO.getArtistDescription());
		newArtist.setArtistFormationYear(Integer.parseInt(artistDTO.getArtistFormationYear()));
		newArtist.setGenre(genre);
		
		
		
		return artistRepository.save(newArtist);
	}


	@Override
	public void deleteArtist(Integer id) {
	if(id != null) {
		artistRepository.deleteById(id);
		
	}

}


	@Override
	public Artist findByArtistName(String artistName) {
		Artist artist = artistRepository.findByArtistName(artistName);
		return artist;
	}


	
	
}
