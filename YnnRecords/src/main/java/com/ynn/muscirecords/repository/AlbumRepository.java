package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Album;

public interface AlbumRepository extends JpaRepository<Integer, Album> {
	
	

}
