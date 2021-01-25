package com.ynn.muscirecords.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.model.DTO.AlbumDTO;


public interface AlbumService {

	List<Album> findAllAlbums();
	Album getAlbumById(Integer id);
	Album save(AlbumDTO albumDTO);
	List<Album> getAlbumsByArtist(Artist artist);
	public void deleteAlbum(Integer id);
}
