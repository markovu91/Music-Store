package com.ynn.muscirecords.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.repository.AlbumRepository;
import com.ynn.muscirecords.repository.ArtistRepository;
import com.ynn.muscirecords.services.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumRepository albumRepository;

	@Override
	public List<Album> getAllAlbums() {
		List<Album> albums = albumRepository.findAll();
		return albums;
	}

	@Override
	public Album getAlbumById(Integer id) {
		Optional<Album> optional = albumRepository.findById(id);
		Album album = null;
		if (optional.isPresent()) {
			album = optional.get();
		} else {throw new RuntimeException("Album not found for id :: "+id);}
		return album;
	}
	
	


}
