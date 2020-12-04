package com.ynn.muscirecords.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.repository.AlbumRepository;
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
	public Artist getArtist() {
		
		return null;
	}

}
