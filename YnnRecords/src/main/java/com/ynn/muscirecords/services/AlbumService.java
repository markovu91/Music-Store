package com.ynn.muscirecords.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;


public interface AlbumService {

	List<Album> getAllAlbums();
	Album getAlbumById(Integer id);
	List<Album> getAlbumsByArtist(Artist artist);

}
