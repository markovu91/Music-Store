package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Genre;

public interface GenreRepository extends JpaRepository<Integer, Genre>{

}
