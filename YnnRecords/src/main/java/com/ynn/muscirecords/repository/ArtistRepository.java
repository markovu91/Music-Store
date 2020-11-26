package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
