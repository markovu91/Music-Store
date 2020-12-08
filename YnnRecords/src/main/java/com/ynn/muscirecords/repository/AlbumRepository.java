package com.ynn.muscirecords.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
	
	List<Album> findByArtist(Artist artist);

	
	
	

}
