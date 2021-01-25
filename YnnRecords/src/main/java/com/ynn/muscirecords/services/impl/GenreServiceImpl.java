package com.ynn.muscirecords.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Genre;
import com.ynn.muscirecords.repository.GenreRepository;
import com.ynn.muscirecords.services.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepository genreRepository;
	
	@Override
	public List<Genre> getAllGenres() {
		List<Genre>genres=genreRepository.findAll();
		return genres;
	}

}
