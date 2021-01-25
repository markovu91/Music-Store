package com.ynn.muscirecords.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.model.DTO.ArtistDTO;

public interface ArtistService {

	public Page<Artist> findPageableArtists(Pageable pageable);
	List<Artist> findAll();
	Artist getArtistById(Integer id);
	Artist findByArtistName(String artistName);
	Artist save(ArtistDTO artistDTO);
	public void deleteArtist(Integer id);
}
